import java.util.*;

public class TextSpliter {

    // There is a dictionary - Set of Strings
    //Get list of Substrings of given String, if there are contained in a dictionary.

    public  static  Set<String>  dictionary;

    public static List<String> textSplit(String s){
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i +1 ; j <= s.length(); j++) {
                for (String word : dictionary) {
                    if(word.equals(s.substring(i,j))){
                        result.add(s.substring(i,j));
                    }
                }
            }
        }

        for (String word :result) {
            System.out.println(word);
        }
        return result;
    }
}
