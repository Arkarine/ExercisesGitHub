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
    public void N_Fibonacci_Test_For60(){
        assertEquals(1548008755920l, fibonacci.N_Fibonacci(60));
    }

    @Test
    public void N_Fibonacci_Test_For101(){
        assertEquals( 2880067194370816120L, fibonacci.N_Fibonacci(90));
    }

    @Test
    public void N_Fibonacci_Test_For0(){
        assertEquals(0, fibonacci.N_Fibonacci(0));
    }

    @Test
    public void N_Fibonacci_Test_For1(){
        assertEquals(1, fibonacci.N_Fibonacci(1));
    }


}
