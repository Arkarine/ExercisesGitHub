import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ParenthesesCheckerTest {
    private ParenthesesChecker pch;

    @Before
    public void setUp(){
        pch = new ParenthesesChecker();
    }

    @Test
    public void checkParenthesesOrderTest_valid() {
        String input = "[()]{}{[()()]()}";
        assertTrue(pch.checkParenthesesOrder(input));
    }

    @Test
    public void checkParenthesesOrderTest_invalid_multipleParenthesesAtTheBeginning() {
        String input = "[[[[[[()]{}{[()()]()}";
        assertFalse(pch.checkParenthesesOrder(input));
    }

    @Test
    public void checkParenthesesOrderTest_outOfOrder() {
        String input = ")(";
        assertFalse(pch.checkParenthesesOrder(input));
    }

    @Test
    public void checkParenthesesOrderTest_invalid_multipleParenthesesAtTheEnd() {
        String input = "[()]{}{[()()]()}}}}}}}}}";
        assertFalse(pch.checkParenthesesOrder(input));
    }
}