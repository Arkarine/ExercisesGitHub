import java.util.HashMap;
import java.util.Map;


public class GreatestCommonDivisorPrimeFactorizations {
    //------ Find Greatest common divisor(gcd) of two numbers--------

    //-----------Using prime factorizations------------------

    public int findGcd(int a, int b){
        if (a == b){
            return a;
        }

        Map<Integer, Integer>  aMap = computedByPrime(a);
        Map<Integer, Integer>  bMap = computedByPrime(b);

        int res = 1;
        int minDegree = 1;

        for (Integer i: aMap.keySet()) {
            if(bMap.keySet().contains(i)){
                minDegree = Integer.min(aMap.get(i), bMap.get(i));
                res = res * (int)Math.pow(i, minDegree);
            }
        }
        return res;
    }

    private Map<Integer, Integer> computedByPrime(int a){
        Map<Integer, Integer>  aMap = new HashMap<Integer, Integer>();  // key = prime, value = degree
        int count = 0;

        for (int i = 2; i <= a ; i = nextPrime(i)) {
            if(isPrime(a)){
                aMap.put(a, 1);
            }
            else{
                while(a % i == 0 ){
                    count ++;
                    a = a / i;
                }
                aMap.put(i, count);
                count = 0;
            }
        }
        return aMap;
    }

    private  int nextPrime (int number){  // number is prime, find next prime number
        int i = 1;
        int checkNumber = number + i;

        while(!isPrime(checkNumber)){
            checkNumber += i;
        }
        return checkNumber;
    }

    private boolean isPrime(int number){
        //number > 0
        int sqrt = (int)Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
