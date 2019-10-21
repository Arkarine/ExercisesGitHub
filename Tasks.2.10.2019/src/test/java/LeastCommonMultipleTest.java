import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeastCommonMultipleTest {
    private LeastCommonMultiple  gcd;

    @Before
    public void init(){
        gcd = new LeastCommonMultiple ();
    }

    @Test
    public void findGcd_equalNumbers(){

        assertEquals(7, gcd.gcd(7,7));
    }

    @Test
    public void findGcd_nonEqualNumbers(){
        assertEquals(3, gcd.gcd(9,6));
    }

    @Test
    public void findGcd_12_8(){
        assertEquals(4, gcd.gcd(12,8));
    }

    @Test
    public void findGcd_primeNumbers(){
        assertEquals(1, gcd.gcd(5,13));
    }

    //--------------------------------------------------
    @Test
    public void lcm_12_8(){
        assertEquals(24, gcd.lcm(12,8));
    }

    @Test
    public void lcm_12_10(){
        assertEquals(60, gcd.lcm(12,10));
    }

}
