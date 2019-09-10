public class StringReformer {
    public static void main(String[] args) {
        char c1  = '5';
        char c2  = 'a';
        char c3  = '@';
        char[] chars = {c1, c2, c3};
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])){
                System.out.println(Character.toUpperCase(chars[i]));
            }
        }
        System.out.println(Character.isUpperCase(55555));
        System.out.println(Character.isUpperCase(65));
        System.out.println(Character.isUpperCase('5'));
        System.out.println(Character.isUpperCase('@'));
        System.out.println(Character.isUpperCase('A'));

        //*************************************
    }
    public static  String  reformer(String s){
        String result = s;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    c = Character.toLowerCase(c);
                }
                else{
                    c = Character.toUpperCase(c);
                }
            }
            result = result.substring(0,i) + c + result.substring(i+1);
        }
        return result;
    }
    //**************Another version of method
    public static String invert(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i]))
                chars[i] = Character.toUpperCase(chars[i]);
            else if (Character.isUpperCase(chars[i]))
                chars[i] = Character.toLowerCase(chars[i]);
        }

        return new String(chars);
    }
}
