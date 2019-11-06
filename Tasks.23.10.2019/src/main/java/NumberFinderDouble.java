import java.util.*;

public class NumberFinderDouble {

    //count of elements from array between [k, k+a]
    public int count(double[] arr, double k, double a){  // k - left side of range, a - length of range
        Arrays.sort(arr);
        int count = 0;
        for (double d:arr) {
            if(d >= k && d <= k+a){
                count ++;
            }
        }
        return count;
    }

    public double findNumber(double[] array, double a){
        int maxCount = 0;
        double result = 0;
        for (double d:array) {
            int currentCount = count(array, d, a);
            if(maxCount < currentCount){
                maxCount = currentCount;
                result = d;
            }
        }
        return result;
    }

}
