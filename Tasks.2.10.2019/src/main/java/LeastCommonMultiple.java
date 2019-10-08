public class LeastCommonMultiple {
    // Greatest Common Divisor - gcd
    // Least Common Multiple  - lcm
    // gcd(a,b) * lcm(a.b) = a*b

    // it's required that a > b
    private int gcdOrdered(int a, int b){
        if(b == 0){
            return a;
        }
        return gcdOrdered(b, a % b);
    }

    public int gcd(int a, int b){
        return gcdOrdered(Integer.max(a,b), Integer.min(a,b));
    }


    public int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }

}
