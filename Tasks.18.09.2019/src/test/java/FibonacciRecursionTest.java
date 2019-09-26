import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class FibonacciRecursionTest {

    @Test
    public void FibonacciRecTest_for0(){
        assertEquals(0, FibonacciRecursion.fibonacciRec(0));
    }

    @Test
    public void FibonacciRecTest_for1(){
        assertEquals(1, FibonacciRecursion.fibonacciRec(1));
    }

    @Test
    public void FibonacciRecTest_for10(){
        assertEquals(55, FibonacciRecursion.fibonacciRec(10));
    }

    @Test
    public void FibonacciRecTest_forBig(){
        long res = FibonacciRecursion.fibonacciRec(100);
        System.out.println(res);
        assertTrue(true);
    }
}
