import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PrimesFromRangeTest {
    private PrimesFromRange pfr;

    @Before
    public void init(){
        pfr = new PrimesFromRange();
    }

    @Test
    public void findPrimesTest_simple(){
        int n = 5;
        List<Integer> expected = Arrays.asList(2, 3, 5);
        assertEquals(expected, pfr.findPrimes(n));
        //Or
        //assertTrue(expected.equals(pfr.findPrimes(n)));
    }

    @Test
    public void findPrimesTest_only_1(){
        int n = 2;
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, pfr.findPrimes(n));
    }

    @Test
    public void findPrimesTest_more(){
        int n = 15;
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13);
        assertEquals(expected, pfr.findPrimes(n));
    }



}
