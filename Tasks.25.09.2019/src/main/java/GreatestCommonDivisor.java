public class GreatestCommonDivisor {

    // Greatest Common Divisor - gcd
    // it's required that a > b

    private int gcdOrdered(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdOrdered(b, a % b);
    }

    public int findGcd(int a, int b){
        return gcdOrdered(Integer.max(a,b), Integer.min(a,b));
    }

}
