import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void createFibonacci(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void N_Fibonacci_Test_For10(){

        assertEquals(55, fibonacci.N_Fibonacci(10));
    }

    @Test
    public void N_Fibonacci_Test_ForBigN(){
        assertEquals(1298777728820984005l, fibonacci.N_Fibonacci(101));
    }


}
