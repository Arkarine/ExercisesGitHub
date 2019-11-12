import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberFinderEfficient {
    public double findNumber(double[] array, double a){
        int maxCount = 0;
        double result = array[0];
        LinkedList<Double> queue = new LinkedList<>();
        Arrays.sort(array);
        for (double point: array) {
            queue.add(point);
            while (point - queue.getFirst() > a){
                queue.removeFirst();
            }
            if(maxCount < queue.size()){
                maxCount = queue.size();
                result = queue.getFirst();
            }
        }

        return result;
    }

}
