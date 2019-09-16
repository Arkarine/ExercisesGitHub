import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramTest {
    private Anagram anagram;

    @Before
    public void createAnagram(){
        anagram = new Anagram();
    }
    @Test
    public  void isAnagramTest_ValidArgument(){
        String s1 = "Hello";
        String s2 = "elolH";
        assertTrue(anagram.isAnagram(s1, s2));
    }

    @Test
    public  void isAnagramTest_InvalidArgument(){
        String s1 = "asdrt";
        String s2 = "elolH";
        assertFalse(anagram.isAnagram(s1, s2));
    }

    @Test
    public  void isAnagramTest_DifferentLenght(){
        String s1 = "Hellohdhsdhajdj";
        String s2 = "elolH";
        assertFalse(anagram.isAnagram(s1, s2));
    }

    @Test
    public  void isAnagramTest_CaseSensitive(){
        String s1 = "Hello";
        String s2 = "elOLH";
        assertFalse(anagram.isAnagram(s1, s2));
    }

}
