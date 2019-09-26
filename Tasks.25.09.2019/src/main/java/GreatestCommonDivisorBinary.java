public class GreatestCommonDivisorBinary {

    //------ Find Greatest common divisor(gcd) of two numbers--------
    //------Binary GCD algorithm------O((log a + log b)*(log a + log b))

    public int findGcd(int a, int b){
        if (a == b){
            return a;
        }
        int d = 0;  //d records the number of times that a and b have been both divided by 2
        while (a % 2 == 0 && b % 2 == 0){
            a = a / 2;
            b = b / 2;
            d++;
        }
        while ( a != b ){
            if(a % 2 == 0){
                a = a/2;
            }
            else if (b % 2 == 0){
                b = b/2;
            }
            else if(a > b){  // a and b are odd => a-b is even, gcd(a,b) = gcd(b,a) = gcd(a-b,a)
                a = (a-b) / 2;
            }
            else {
                b = (b-a) / 2;
            }
        }
        return a * (int)Math.pow(2, d);  // a = b and  Math.pow(2, d) is a comon divisor
    }
}
