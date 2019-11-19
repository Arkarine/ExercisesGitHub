public class SubSequentEfficient {
    public static  boolean isSubSequentRec(String text, int indexText, String pattern, int indexPattern){
        // text = "Helloworld"
        // pattern = "Hwd" => true

        if(indexPattern == -1){
            return true;
        }
        /*
        if(indexText == -1){
            return false;
        }
         */

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

    public static  boolean isSubSequent(String text, String pattern){
        int indexText = text.length() - 1;
        int indexPattern = pattern.length() - 1;
        return isSubSequentRec(text, indexText, pattern, indexPattern);
    }

    public static void main(String[] args) {

        String text = "Helloworld";
        String pattern = "Hwd";
        System.out.println(isSubSequent(text, pattern));
    }
}
