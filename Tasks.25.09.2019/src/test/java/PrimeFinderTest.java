import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFinderTest {
    private PrimeFinder pf;

    @Before
    public void init(){
        pf = new PrimeFinder();
    }

    @Test
    public void findPrimes_simple(){
        int input = 2;
        List<Integer> result = Arrays.asList(2);
        assertEquals(result, pf.findPrimes(2));
        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void findPrimes_N_15(){
        int input = 15;
        List<Integer> result = Arrays.asList(2, 3, 5, 7, 11, 13);
        assertEquals(result, pf.findPrimes(15));
        System.out.println(Arrays.toString(result.toArray()));
    }
}
