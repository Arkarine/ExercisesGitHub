import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SingleFinderTest {
    @Test
    public void findSingleTest(){
        int[] input = {2, 2, 3, 5, 5};
        assertEquals(3, SingleFinder.findSingle(input));
    }

    @Test
    public void findSingleTest_MoreThanTwo(){
        int[] input = {2, 2, 2, 5, 5};
        assertEquals(2, SingleFinder.findSingle(input));
    }
}
