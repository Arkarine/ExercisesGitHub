import java.util.*;

public class CountCommonCharacters {

    // -----------EXTRA TASK---------

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "aad";
        System.out.println(countCommontChar(s1, s2)); // must be 2

        String s3 = "geeksforgeeks";
        String s4 = "platformforgeeks";
        System.out.println(countCommontChar(s3, s4)); // must be 8

        String s5 = "characterswillnotbe";
        String s6 = "characterswxxxxxx";
        System.out.println(countCommontChar(s5, s6)); // must be 11

    }
        /*
        Count common characters in two strings
    Given two strings s1 and s2 consisting of lowercase English alphabets,
    the task is to count all the pairs of indices (i, j) from the given strings
    such that s1[i] = s2[j] and all the indices are distinct i.e. if s1[i] pairs
    with some s2[j] then these two characters will not be paired with any other character.

    Example

    Input: s1 = “abcd”, s2 = “aad”
    Output: 2
    (s1[0], s2[0]) and (s1[3], s2[2]) are the only valid pairs.
    (s1[0], s2[1]) is not includes because s1[0] has already been paired with s2[0]

    Input: s1 = “geeksforgeeks”, s2 = “platformforgeeks”
    Output: 8
         */

    public static int countCommontChar(String s1, String s2){
        Map<Character, Integer> maps1 = new HashMap<Character, Integer>();
        Map<Character, Integer> maps2 = new HashMap<Character, Integer>();
        Integer count;
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(maps1.get(s1.charAt(i)) == null){
                maps1.put(s1.charAt(i), 1);
            }
            else{
                count = maps1.get(s1.charAt(i));
                maps1.put(s1.charAt(i), count + 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if(maps2.get(s2.charAt(i)) == null){
                maps2.put(s2.charAt(i), 1);
            }
            else{
                count = maps2.get(s2.charAt(i));
                maps2.put(s2.charAt(i), count + 1);
            }
        }
        /*
        for (Character ch : maps1.keySet()) {
            if (maps2.containsKey(ch)){
                if ( maps1.get(ch).equals(maps2.get(ch))){
                    result = result + maps1.get(ch);
                }
                else{
                    result = result + Math.abs(maps1.get(ch) - maps2.get(ch));
                }
            }
        }

         */
        // OR more effective

        for (Character ch : maps1.keySet()) {
            if (maps2.containsKey(ch)){
                result = result + Math.min(maps1.get(ch), maps2.get(ch));
            }
        }
        return result;
    }

}
