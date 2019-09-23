import java.util.*;

public class SplittedWordsFinder {
    /*
     Given a vocabulary of words (Set), find out which words from vocabulary
    can be segmented into a sequence(List) of vocabulary words.
     */
    public  static Set<String> vocabulary;

    public List<String> findSplittedWords(){
        Set<String> copyVoc = new HashSet<>(vocabulary);
        List<String> result = new ArrayList<>();
        for (String word:vocabulary) {
            copyVoc.remove(word);
            if(isDivide(word, copyVoc)){
                result.add(word);
            }
            copyVoc.add(word);
        }
        return result;
    }

    private boolean isDivide(String text, Set<String> copyVoc) {
        LinkedList<String> res = new LinkedList<String>();
        try {
            divideUtil(text, copyVoc);
            return true;
        } catch (NotSplitException e) {
            return false;
        }
    }

    private void divideUtil(String text, Set<String> copyVoc) throws NotSplitException {
        if(text.equals("")){
            return;
        }
        for (String word : copyVoc) {
            if(text.startsWith(word) ){
                try {
                    divideUtil(text.substring(word.length()), copyVoc);
                    return;
                }catch (NotSplitException e) {
                }
            }
        }
        throw new NotSplitException();
    }
}
