import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringReformerTest {
    @Test
    public void reformerTest(){
        assertEquals(StringReformer.reformer("Hello"), "hELLO");
    }
    @Test
    public void reformerWithSymbolsTest(){
        assertEquals(StringReformer.reformer("He*#o"), "hE*#O");
    }
    //*************
    @Test
    public void testInvert_EmptyString() {
        assertEquals(StringReformer.invert(""), "");
    }

    @Test
    public void testInvert_OneLetterWord() {
        assertEquals(StringReformer.invert("a"), "A");
    }

    @Test
    public void testInvert_SimpleWorld() {
        assertEquals(StringReformer.invert("Telran"), "tELRAN");
    }

    @Test
    public void testInvert_TwoWordsWithSpace() {
        assertEquals(StringReformer.invert("Telran Is GrEat"), "tELRAN iS gReAT");
    }

    @Test
    public void testInvert_NonLetterCharacter() {
        assertEquals(StringReformer.invert("Telran Is GrEat!+5"), "tELRAN iS gReAT!+5");
    }
}
