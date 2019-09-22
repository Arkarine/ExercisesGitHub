import java.util.HashMap;
import java.util.Map;

public class Anagram {
    /*
    Write a function to check whether two given strings are an Anagram of each other or not.
     */

    public boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character, Integer> maps1 = new HashMap<Character, Integer>();
        Map<Character, Integer> maps2 = new HashMap<Character, Integer>();
        maps1 = mapFromString(s1);
        maps2 = mapFromString(s2);

        for (Character ch : maps1.keySet()) {
            if(!(maps2.keySet().contains(ch) && maps1.get(ch).equals(maps2.get(ch)))){
                return false;
            }
        }
        return true;

    }

    private Map<Character, Integer> mapFromString (String s){
        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(result.get(s.charAt(i)) == null){
                result.put(s.charAt(i), 1);
            }
            else {
                Integer count = result.get(s.charAt(i));
                result.put(s.charAt(i), count +1 );
            }
        }
        return result;
    }
}