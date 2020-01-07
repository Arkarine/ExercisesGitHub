import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SegmentsQuantityFinderTest {
    private SegmentsQuantityFinder sqf;

    @Before
    public void init(){
        sqf = new SegmentsQuantityFinder();
    }

    /*
         2---------------------6                          10---------------------------13
    1-------------4                        8---------------------------------12
    ---------3-----------5-----------7------------9------------------11-------------------------> input points
 results    (2)         (1)         (0)          (1)                 (2)

    */
    @Test
    public void findSegmentsQuantityTest_orderedInputs(){
        List<Segment> segments = Arrays.asList(
                new Segment(1,4),
                new Segment(2,6),
                new Segment(8,12),
                new Segment(10, 13));

        double[] inputs = {3, 5, 7, 9, 11};

        List<Integer> segmentsQuantity = sqf.findSegmentsQuantity(segments, inputs);

        assertEquals(Arrays.asList(2,1,0,1,2), segmentsQuantity);
    }

    @Test
    public void findSegmentsQuantityTest_unorderedInputs(){
        List<Segment> segments = Arrays.asList(
                new Segment(8,12),
                new Segment(1,4),
                new Segment(10, 13),
                new Segment(2,6));

        double[] inputs = {11, 5, 7, 3, 9};

        List<Integer> segmentsQuantity = sqf.findSegmentsQuantity(segments, inputs);

        assertEquals(Arrays.asList(2,1,0,1,2), segmentsQuantity);
    }

    /*
         2---------------5                                 10---------------------------13
    1-------------4                           8---------------------------------12
    --------------------------6---------7------------------------------------------------------14----> input points
 results                     (0)       (0)                                                    (0)

    */

    @Test
    public void findSegmentsQuantityTest_notContains(){
        List<Segment> segments = Arrays.asList(
                new Segment(2,5),
                new Segment(1,4),
                new Segment(10, 13),
                new Segment(8,12));

        double[] inputs = {14, 6, 7};

        List<Integer> segmentsQuantity = sqf.findSegmentsQuantity(segments, inputs);

        assertEquals(Arrays.asList(0, 0, 0), segmentsQuantity);
    }

    /*
         2--------------------------------------------------------------------------------------14
             3----------------------------------------------------------------------12
                    4---------------------------------------------------10
                            5---------------------------------8
    -------------------------------------------7----------------------------------------------------> input points
 results                                      (4)

    */

    @Test
    public void findSegmentsQuantityTest_containsAll(){
        List<Segment> segments = Arrays.asList(
                new Segment(2,14),
                new Segment(3,12),
                new Segment(4, 10),
                new Segment(5,8));

        double[] inputs = {7};

        List<Integer> segmentsQuantity = sqf.findSegmentsQuantity(segments, inputs);

        assertEquals(Arrays.asList(4), segmentsQuantity);
    }
}
