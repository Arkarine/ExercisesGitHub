import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringReverserTest {

    @Test
    public void reverseStringTest (){
        String s = "Hello";
        String result = StringReverser.reverseString(s);
        assertEquals("olleH", result);
    }

    @Test(expected = NullPointerException.class)
    public void reverseStringTestForNull (){
        String result = StringReverser.reverseString(null);
    }

    @Test
    public void testReverse_EmptyString_EmptyString() {
        assertEquals(StringReverser.reverseString(""), "");
    }

    @Test
    public void testReverse_OneWord_reversedOneWord() {
        assertEquals(StringReverser.reverseString("String"), "gnirtS");
    }
}
