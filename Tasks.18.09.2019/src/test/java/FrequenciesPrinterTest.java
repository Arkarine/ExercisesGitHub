import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrequenciesPrinterTest {
    private FrequenciesPrinter freq;

    @Before
    public void init(){
        freq = new FrequenciesPrinter();
    }

    @Test
    public void charWithFrequenciesTest_simple(){
        String input = "aaabbcc";
        assertEquals("a3b2c2", freq.charWithFrequencies(input));
    }

    @Test
    public void charWithFrequenciesTest_complex(){
        String input = "accaabbccaaba";
        assertEquals("a6b3c4", freq.charWithFrequencies(input));
    }
}
