import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinPointsForSegments {
    /*
    Given n intervals. Find the set of points having the minimum size (cardinality),
    for which each of the given intervals contains at least one of the points.

    The first line given n – number of intervals.
    Each of the next n lines contains two numbers, setting the beginning and the end of the interval.
  Output the minimum size of the set m and the m points themselves.
   If there are several such sets, output any of them.
     */


    public int findMinPoints(List<Segment> segments){
        int quantity = 0;
        LinkedList<Double> leftQueue = new LinkedList<>();
        LinkedList<Double> rightQueue = new LinkedList<>();
        for (int i = 0; i < segments.size(); i++) {
            leftQueue.add(segments.get(i).getLeft());
            rightQueue.add(segments.get(i).getRight());
        }
        Collections.sort(leftQueue);
        Collections.sort(rightQueue);

        return findMinPointsRec(leftQueue, rightQueue, quantity);
    }


    public int findMinPointsRec(LinkedList<Double> leftQueue, LinkedList<Double> rightQueue, int quantity) {
        if(leftQueue.size() == 0){
            return quantity;
        }
        while(leftQueue.size() != 0 && leftQueue.getFirst() < rightQueue.getFirst()){
            leftQueue.remove(leftQueue.getFirst());
        }
        quantity = quantity + 1;
        rightQueue.remove(rightQueue.getFirst());
        return findMinPointsRec(leftQueue, rightQueue, quantity);
    }
}


