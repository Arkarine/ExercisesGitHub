import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SegmentsQuantityFinder {
    /*
    Given segments and points in the line, find for each point the quantity of segments, that contains that point.
    For example.
    ------------     -------------------------
          ----------        ------------
                        ------------------       ---------------
   -------- . -------------------- . -------------------- . ------------ . ----->
            2                      3                      1              0
     */

    public List<Integer> findSegmentsQuantity(List<Segment> segments, double[] inputs){

        List<Point> allPoints = new ArrayList<>();
        for (int i = 0; i < segments.size(); i++) {
            allPoints.add(new Point(segments.get(i).left, "start"));
            allPoints.add(new Point(segments.get(i).right, "end"));
        }
        for (int i = 0; i < inputs.length; i++) {
            allPoints.add(new Point(inputs[i], "point"));
        }
        int quantity = 0;
        List<Integer> result = new ArrayList<>();
        Collections.sort(allPoints);
        for (int i = 0; i < allPoints.size(); i++) {
            if(allPoints.get(i).getStatus().equals("start")){
                quantity ++;
            }
            if(allPoints.get(i).getStatus().equals("end")){
                quantity --;
            }
            if(allPoints.get(i).getStatus().equals("point")){
                result.add(quantity);
            }
        }
        return result;
    }
}
