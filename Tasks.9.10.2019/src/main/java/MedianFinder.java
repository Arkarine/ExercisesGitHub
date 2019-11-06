import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    // Find Median from Data Stream

    private PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>(); //higher half
    private PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(Comparator.reverseOrder()); //lower half

    public void addElement(int i){
        minPQ.add(i);
        maxPQ.add(minPQ.poll());

        // either minPQ.size = maxPQ.size or minPQ.size = maxPQ.size +1
        if(minPQ.size() < maxPQ.size()){
            minPQ.add(maxPQ.poll());
        }
    }
    public double findMedian() throws Exception {
        if(minPQ.size() == 0){
            throw new Exception();
        }
        if(maxPQ.size() == 0){
            return minPQ.peek();
        }
        if(minPQ.size() > maxPQ.size()){
            return minPQ.peek();
        }
        else {
            return (double) (minPQ.peek() + maxPQ.peek())/2.0;
        }
    }
}


