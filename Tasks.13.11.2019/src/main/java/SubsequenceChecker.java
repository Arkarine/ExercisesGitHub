import java.util.LinkedList;
import java.util.List;

public class SubsequenceChecker {
    /*
    Given text1 and text2.
    Check if text1 is equal to the concatenation of subsequences of text2
    O(n)
     */
    public boolean isSubsequencesConcat(String text1, String text2) {
        LinkedList<String> result = new LinkedList<>();

        try {
            isSubsequencesConcatRec(text1, text2);
            result.forEach(System.out::println);
            return true;
        } catch (NotSplitException e) {
            return false;
        }
    }

    private void isSubsequencesConcatRec(String text1, String text2) throws NotSplitException {
        if (text1.length() == 0){
            return;
        }
        for (int i = 0; i < text1.length(); i++) {
            String pattern = text1.substring(0,i+1);
            if(isSubSequent(text2, pattern)){
                try {
                    //isSubsequencesConcatRec(text1.substring(pattern.length()),text2);
                    isSubsequencesConcatRec(text1.substring(i + 1),text2);
                    return;
                } catch (NotSplitException e) {

                }
            }
        }
        throw new NotSplitException();
    }

    //----------------------------------------------
    /*
    Given two strings, find if second string is a subsequence of first
    text = "Helloworld"
    pattern = "Hwd" => true
     */
    private boolean isSubSequent(String text, String pattern){
        int indexText = text.length() - 1;
        int indexPattern = pattern.length() - 1;
        return isSubSequentRec(text, indexText, pattern, indexPattern);
    }

    private boolean isSubSequentRec(String text, int indexText, String pattern, int indexPattern){

        if(indexPattern == -1){
            return true;
        }

        if(indexText < indexPattern){
            return false;
        }

        if (text.charAt(indexText) == pattern.charAt(indexPattern)) {
            indexText --;
            indexPattern --;
        }
        else{
            indexText --;
        }
        return isSubSequentRec(text, indexText, pattern, indexPattern);
    }
}
