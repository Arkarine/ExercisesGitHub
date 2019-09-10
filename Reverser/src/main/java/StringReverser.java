public class StringReverser {
    public static String reverseString(String s) throws NullPointerException{
        if(!s.equals(null)){
            StringBuilder builder = new StringBuilder(s);
            builder = builder.reverse();
            return builder.toString();
        }
        return null;
    }
}
