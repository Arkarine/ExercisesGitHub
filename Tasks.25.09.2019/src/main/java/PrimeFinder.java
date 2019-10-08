import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    /*
    Find all prime numbers between [0, n]
     */

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

    public List<Integer> findPrimes(int n){
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }
}
