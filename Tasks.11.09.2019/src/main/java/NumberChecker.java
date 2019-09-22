public class NumberChecker {

    /*
    input N
    if divided by 3 -> print "Divided 3"
    if divided by 5 -> print "Divided 4"
    if don't divided neither 3 nor 5 -> print "N"
     */
    public static void isDivided3_5(int N){
        if(N % 3 == 0){
            System.out.println("Is divided by 3.");
        }
        else if(N % 5 == 0){
            System.out.println("Is divided by 5.");
        }
        else {
            System.out.println("N");
        }
    }
}
