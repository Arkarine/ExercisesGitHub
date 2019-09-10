public class CircularMethod {

    // "abcde", "eabcd"-> true
    // "bbcda", "dabbc"-> true
    // "abcde", "edbac"-> false
    // "ab", "ba" -> true
    // "a","a" -> true
    // "abc", "cab" -> true

    public static boolean isEqual(StringBuilder a, StringBuilder b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCircular(String s1, String s2) {

        StringBuilder tmp = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);

        if(s1.length() != s2.length())
            return false;

        for (int i = 0; i < tmp.length(); i++) {
            tmp.delete(0, 1);
            tmp.append(s1.charAt(i));

            //"StringBuilder doesn't declare its own equals method"
            // that's why either
            //if (tmp.toString().equals(sb2.toString())) {
            // OR

            if (isEqual(tmp, sb2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean  isFirstCyclicallyCircular(String s1, String s2){
        //s1.length() >= s2.length();
        if(!(s1.length() % s2.length() == 0)){
            return false;
        }
        for (int i = 0; i < s1.length() - s2.length(); i++) {
            if(!isCircular(s1.substring(i, i + s2.length()), s2)){
                return false;
            }
        }
        return true;
    }

    public static boolean isCyclicallyCircular(String s1, String s2){
        boolean result = false;
        if(s1.length() >= s2.length()){
            result = isFirstCyclicallyCircular(s1,s2);
        }
        else {
            result = isFirstCyclicallyCircular(s2,s1);
        }
        return result;
    }
}

