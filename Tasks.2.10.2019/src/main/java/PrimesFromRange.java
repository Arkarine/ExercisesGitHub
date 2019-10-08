import java.util.ArrayList;
import java.util.List;

public class PrimesFromRange {
    public List<Integer>  findPrimes(int n){
        List<Integer> result = new ArrayList<>();
        boolean[] boolArr = new boolean[n + 1];
        // we check each element in the range [2, n], if element x is checked -> boolArr[x] = true
        for (int i = 2; i <= n; i++) {
            if(boolArr[i] == false){
                result.add(i);
                for (int j = i; j*i <= n; j++) {
                    boolArr[j*i] = true;
                }
            }
        }
        return result;
    }
}
