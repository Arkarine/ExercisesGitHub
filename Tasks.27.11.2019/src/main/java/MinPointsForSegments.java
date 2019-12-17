import java.util.Collections;
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

    /*  На числовой прямой даны отрезки.
    Найти минимальное количество точек так, чтобы каждый отрезок покрывал хотябы одну точку.
    */

    public int findMinPoints(List<Segment> segments){
        int quantity = 1;
        Collections.sort(segments);
        double minRightBorder = segments.get(0).getRight();
        for (int i = 1; i < segments.size(); i++) {
            if(segments.get(i).getRight() < minRightBorder){
                minRightBorder = segments.get(i).getRight();
            }
            else if(segments.get(i).getLeft() > minRightBorder){
                quantity ++;
                minRightBorder = segments.get(i).getRight();
            }
        }
        return quantity;
    }
}
