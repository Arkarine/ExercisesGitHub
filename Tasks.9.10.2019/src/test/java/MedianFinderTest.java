import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MedianFinderTest {
    private MedianFinder mf;

    @Before
    public void init(){
        mf = new MedianFinder();
    }

    @Test
    public void findMedianTest_even() throws Exception {
        mf.addElement(12);
        mf.addElement(5);
        mf.addElement(3);
        mf.addElement(7);
        mf.addElement(2);
        mf.addElement(20);
        assertEquals(6, mf.findMedian(), 0);
    }

    @Test
    public void findMedianTest_odd() throws Exception {
        mf.addElement(12);
        mf.addElement(5);
        mf.addElement(3);
        mf.addElement(7);
        mf.addElement(2);
        assertEquals(5, mf.findMedian(), 0);
    }

    @Test(expected = Exception.class)
    public void findMedianTest_0_size() throws Exception {
        mf.findMedian();
    }
    @Test()
    public void findMedianTest_1_lement() throws Exception {
        mf.addElement(12);
        assertEquals(12, mf.findMedian(), 0);
    }
}
