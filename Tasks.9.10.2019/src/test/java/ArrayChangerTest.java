import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayChangerTest {
    private ArrayChanger ch;

    @Before
    public void init(){
        ch = new ArrayChanger();
    }

    @Test
    public void changArrayTest(){
        List<Integer> expected = Arrays.asList(0, 0 , 1, 2, 8,-10, 3, 25);
        List<Integer> input = Arrays.asList(1, 2, 8, -10, 0, 3, 0, 25);
        assertEquals(expected, ch.changArray(input));
    }

    @Test
    public void changArrayTest_OneNull(){
        List<Integer> input = Arrays.asList(30, 20, 1, 2, 8,-10, 0, 25);
        List<Integer> expected = Arrays.asList(0, 30, 20 , 1, 2, 8,-10, 25);
        assertEquals(expected, ch.changArray(input));
    }

    @Test
    public void changArrayTest_OneNotNull(){
        List<Integer> input = Arrays.asList(0, 0, 1, 0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1);
        assertEquals(expected, ch.changArray(input));
    }
}
