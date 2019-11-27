import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SubsequenceCheckerTest {
    private SubsequenceChecker sch;

    @Before
    public void init(){
        sch = new SubsequenceChecker();
    }

    @Test
    public void isSubsequencesConcatTest_trueResult(){
        String text1 = "ellomlin";
        String text2= "HelloFromBerlin";
        assertTrue(sch.isSubsequencesConcat(text1, text2));
    }

    @Test
    public void isSubsequencesConcatTest_falseResult(){
        String text1 = "ellocmlin";
        String text2= "HelloFromBerlin";
        assertFalse(sch.isSubsequencesConcat(text1, text2));
    }

    @Test
    public void isSubsequencesConcatTest_repeated(){
        String text1 = "elloello";
        String text2= "HelloFromBerlin";
        assertTrue(sch.isSubsequencesConcat(text1, text2));
    }
}
