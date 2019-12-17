import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinPointsForSegmentsTest {
    private MinPointsForSegments mps;

    @Before
    public void init(){
        mps = new MinPointsForSegments();
    }

    @Test
    public void findMinPoints_test(){
        List<Segment> segments = Arrays.asList(
                new Segment(14.2, 15.6),
                new Segment(10.2, 26.6),
                new Segment(4.2, 11.6),
                new Segment(20.3, 25.6),
                new Segment(24.2, 27.6));
        assertEquals(3, mps.findMinPoints(segments));
    }

    @Test
    public void findMinPoints_segmentsDoNotIntersects(){
        List<Segment> segments = Arrays.asList(
                new Segment(1, 2),
                new Segment(3, 4),
                new Segment(6, 7),
                new Segment(9, 11),
                new Segment(15, 17));
        assertEquals(5, mps.findMinPoints(segments));
    }
}
