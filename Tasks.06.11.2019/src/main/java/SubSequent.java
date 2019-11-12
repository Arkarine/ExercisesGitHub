public class SubSequent {
    public static  boolean isSubSequent(String text, String pattern){
        // text = "Helloworld"
        // pattern = "Hwd" => true
        StringBuilder patternBuilder = new StringBuilder(pattern);
        StringBuilder textBuilder = new StringBuilder(text);
         if (patternBuilder.length() == 0){
             return true;
         }
        if (textBuilder.length() == 0){
            return false;
        }

        if(patternBuilder.charAt(patternBuilder.length()-1) == textBuilder.charAt(textBuilder.length()-1)){
            patternBuilder = patternBuilder.deleteCharAt(patternBuilder.length()-1);
            textBuilder = textBuilder.deleteCharAt(textBuilder.length()-1);
        }
        else{
            textBuilder = textBuilder.deleteCharAt(textBuilder.length()-1);
        }
        return isSubSequent(textBuilder.toString(), patternBuilder.toString());
    }

    public static void main(String[] args) {
        String text = "Helloworld";
        String  pattern = "Hwd";

       System.out.println(isSubSequent(text, pattern));
    }
}
