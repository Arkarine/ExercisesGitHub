import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TextFullSplitter {
    /*
    Given an input string and a dictionary of words (Set), find out
    if the input string can be segmented into a
    sequence(List) of dictionary words.
     */
    public  static Set<String> vocabulary;

    public static List<String> divide(String text) throws NotSplitException {
        LinkedList<String> res = new LinkedList<String>();
        divideUtil(text, res);
        return res;
    }

    // result List store the current substring

    public static void divideUtil(String text, LinkedList<String> result) throws NotSplitException {
        if(text.equals("")){
            return;
        }
        for (String word : vocabulary) {
            if(text.startsWith(word)){
                result.add(word);
                try{
                    divideUtil(text.substring(word.length()), result);
                    return;
                }catch (NotSplitException e){
                    result.removeLast();
                }
            }
        }
        throw new NotSplitException();
    }

}
