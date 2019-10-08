import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorBinaryTest {

    private GreatestCommonDivisorBinary gcd;

    @Before
    public void init(){
        gcd = new GreatestCommonDivisorBinary();
    }

    @Test
    public void findGcd_equalNumbers(){
        assertEquals(7, gcd.findGcd(7,7));
    }

    @Test
    public void findGcd_nonEqualNumbers(){
        assertEquals(3, gcd.findGcd(9,6));
    }

    @Test
    public void findGcd_12_8(){
        assertEquals(4, gcd.findGcd(12,8));
    }

    @Test
    public void findGcd_primeNumbers(){
        assertEquals(1, gcd.findGcd(5,13));
    }

    //-------------------------
    @Test
    public void findGcd_big(){
        System.out.println(gcd.findGcd(240, 360));
    }
}
