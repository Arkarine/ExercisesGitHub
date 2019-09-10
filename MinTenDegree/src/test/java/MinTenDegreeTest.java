import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class MinTenDegreeTest {

    @Test
    public  void testFindMin_inputOne_output0(){
        assertEquals(0,MinTenDegree.findMin(1));
    }
    @Test
    public  void testFindMin_input9_output0(){
        assertEquals(0,MinTenDegree.findMin(9));
    }

    @Test
    public  void testFindMin_inputLastNumber_outputLastNumber(){
        assertEquals(1000000000,MinTenDegree.findMin(1000000000));
    }

    @Test
    public  void testFindMin_inputLast53799_output10000(){
        assertEquals(10000,MinTenDegree.findMin(53799));
    }

    @Test
    public  void testFindMin_inputLast10000_output10000(){
        assertEquals(10000,MinTenDegree.findMin(10000));
    }
}
