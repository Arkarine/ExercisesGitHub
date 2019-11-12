import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberFinderDoubleTest {
    private NumberFinderDouble nfd;
    @Before
    public void init(){
        nfd = new NumberFinderDouble();
    }

    @Test
    public void findNumberTest_big_a(){
        double[] array = new double[]{1.4, 2.2, 3.3, 8.1, 9.7, 13.6, 14.1, 15.9, 16.4, 17.2, 18.6, 19.5, 25.7, 26.6};
        double a = 4;
        assertEquals(13.6, nfd.findNumber(array, a), 0.1);
        System.out.println(nfd.findNumber(array, a));
    }

    @Test
    public void findNumberTest_small_a(){
        double[] array = new double[]{1.4, 1.7, 1.8, 1.9, 2, 2.1};
        double a = 0.3;
        assertEquals(1.7, nfd.findNumber(array, a), 0.1);
        System.out.println(nfd.findNumber(array, a));
    }

}
