import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharsWithCountPrinterTest {
    private CharsWithCountPrinter pr;

    @Before
    public void init(){
        pr = new CharsWithCountPrinter();
    }

    @Test
    public void charsCountPrint_simple(){
        assertEquals("a4b2a2c3", pr.charsCountPrint("aaaabbaaccc"));
    }

    @Test
    public void charsCountPrint_complex(){
        assertEquals("a4b2a2c3a2", pr.charsCountPrint("aaaabbaacccaa"));
    }
}
