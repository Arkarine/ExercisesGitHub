import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveFinderTest {
    private FirstMissingPositiveFinder fmp;

    @Before
    public void init(){
        fmp = new FirstMissingPositiveFinder();
    }

    @Test
    public void findFristPositiveTest_allPositive(){
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(6,fmp.findFristPositive(input));
    }

    @Test
    public void findFristPositiveTest_repeatedValue(){
        int[] input = {2, 2, 2, 2, 2};
        assertEquals(1,fmp.findFristPositive(input));
    }

    @Test
    public void findFristPositiveTest_allNegative(){
        int[] input = {-1, -2, -3, -25, -75};
        assertEquals(1,fmp.findFristPositive(input));
    }

    @Test
    public void findFristPositiveTest_common(){
        int[] input = {-1, -2, 3, 5, -75};
        assertEquals(1,fmp.findFristPositive(input));
    }

}
