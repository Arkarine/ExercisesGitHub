import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CircularMethodTest {
    @Test
    public void isCyclicallyCircularTest(){
        String s1 = "HelloHelloHelloHelloHello";
        String s2 = "loHel";
        assertTrue(CircularMethod.isCyclicallyCircular(s1, s2));
    }

    @Test
    public void isCyclicallyCircularInvalidLenghtTest(){
        String s1 = "HelloHelloHelloHelloHel";
        String s2 = "loHel";
        assertFalse(CircularMethod.isCyclicallyCircular(s1, s2));
    }
}
