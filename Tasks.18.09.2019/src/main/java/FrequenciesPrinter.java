import java.util.HashMap;
import java.util.Map;

public class FrequenciesPrinter {
    /*
    Given a string str containing only lowercase characters.
    The task is to print the characters along with their
    frequencies in the order of their occurrence in the given string.

    "aaabbcc" -> "a3b2c2"
     */
    public String charWithFrequencies(String s){
        Map<Character, Integer> sMap = new HashMap<>();
        char[] chars = s.toCharArray();
        //Character[] charsCH = Arrays.stream(chars).boxed().toArray( Character[]::new );
        Character[] charsObj = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsObj[i] = chars[i];
        }

        Integer count;

        for (int i = 0; i < charsObj.length; i++) {
            if(sMap.get(charsObj[i]) == null){
                sMap.put(charsObj[i], 1);
            }
            else{
                count = sMap.get(charsObj[i]);
                sMap.put(charsObj[i], count +1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Character ch : sMap.keySet()) {
            sb = sb.append(ch).append(sMap.get(ch));
        }

        return sb.toString();
    }
}
