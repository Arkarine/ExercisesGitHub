public class ModulusFinder {
    /*
    Given n, m where n >= 0, m > 1.
    Find F(n) % m, where F(n) - n-th Fibonacci, % - operator Modulus
    =============================
    Suppose d1 = a1 % m and d2 = a2 % m  => (a1 + a2) % m == (d1 + d2) % m
     */

    // not effective because Fibonacci(n) is too big for big n and imposible it to compute //

    public int findFibonacci(int n){  // n >= 0

        if(n <= 1){
            return n;
        }
        int F_first = 0;
        int F_second = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = F_first + F_second;
            F_first = F_second;
            F_second = result;

        }
        return result;
    }

    public int findModulus(int n, int m){   // m >1
        return findFibonacci(n) % m;
    }

    //====================  effective  approach ===============
    // (using d1 = a1 % m and d2 = a2 % m  => (a1 + a2) % m == (d1 + d2) % m)

    public int findModulusEffective(int n, int m){   // m >1
        int F_first = 0;
        int F_second = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (F_first  + F_second ) % m;
            F_first = F_second;
            F_second = result;

        }
        return result;
    }

    //=============================================

    public static void main(String[] args) {
        ModulusFinder mf = new ModulusFinder();
        //System.out.println(mf.findFibonacci(10));
        System.out.println(mf.findModulus(16, 5));
        System.out.println(mf.findModulusEffective(16, 5));
    }

}
