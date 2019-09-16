import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TextFullSplitter {
    /*
    Given an input string and a dictionary of words (Set), find out
    if the input string can be segmented into a
    sequence(List) of dictionary words.
     */
    public  static Set<String> dictionary;

    public static List<String> divide(String str)
    {
        List<String> result = new ArrayList<String>();
        divideUtil(str, str.length(), result);
        return result;
    }

    // result List store the current substring

    public static List<String> divideUtil(String str, int n, List<String> result)
    {
        for (int i=1; i<= n; i++){

            String substr = str.substring(0, i);

            //check
            // if dictionary contains this substr,
            // and remaining string starts with a word from dictionary
            // or there is no more remaining string
            // then add to the result list

            if (dictionary.contains(substr) && (isStartsDictWord(str.substring(i,n)) || i==n)){
                result.add(substr);
                divideUtil(str.substring(i, n),n-i, result);
            }
        }
        return result;
    }

    public static boolean isStartsDictWord(String s){
        for (String word: dictionary) {
            if(s.startsWith(word)){
                return true;
            }
        }
        return false;
    }
}
