import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class RepeatedElementFinderTest {
    private RepeatedElementFinder ref;

    @Before
    public void init(){
        ref = new RepeatedElementFinder();
    }

    @Test
    public void findRepeatedElemet_common(){
        int[] input = {1,2,3,1,1};
        assertTrue(ref.findRepeatedElemet(input));
    }

    @Test
    public void findRepeatedElemet_single(){
        int[] input = {1};
        assertTrue(ref.findRepeatedElemet(input));
    }
}
