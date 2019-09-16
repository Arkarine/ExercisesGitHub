import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class NumberCheckerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void divided3() {
        NumberChecker.isDivided3_5(6);
        assertEquals("Is divided by 3.\r\n", outContent.toString());
    }

    @Test
    public void divided5() {
        NumberChecker.isDivided3_5(10);
        assertEquals("Is divided by 5.\r\n", outContent.toString());
    }

    @Test
    public void dont_divided() {
        NumberChecker.isDivided3_5(13);
        assertEquals("N\r\n", outContent.toString());
    }

}
