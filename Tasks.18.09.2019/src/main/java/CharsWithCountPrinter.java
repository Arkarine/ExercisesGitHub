import java.util.Arrays;

public class CharsWithCountPrinter {
    /*
    Printing frequency of each character after its consecutive occurrences

     //aaaabbcccaa -> a4b2c3a2
     */


    public  String charsCountPrint(String s){

        StringBuilder sb = new StringBuilder();

        int sLength = s.length();
        for (int i = 0; i < sLength - 1; i++){
            int count = 1;
            while (i < sLength - 1 && s.charAt(i) == s.charAt(i +1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i)).append(count);
        }
        return sb.toString();
    }
}




