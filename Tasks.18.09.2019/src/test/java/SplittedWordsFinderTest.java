import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SplittedWordsFinderTest {

    private SplittedWordsFinder swf;

    Set<String> vocabulary = new HashSet<>(Arrays.asList("Given", "in", "wo","to", "of", "find", "which", "words", "from",
            "vocabulary", "can", "word", "s", "segmented", "into", "sequence"));

    @Before
    public void init(){
        swf = new SplittedWordsFinder();
    }

    @Test
    public void findSplittedWordsTest_2words() {
        SplittedWordsFinder.vocabulary = vocabulary;
        List<String> expected = Arrays.asList("words", "into");
        assertEquals(expected, swf.findSplittedWords());
    }

    @Test
    public void findSplittedWordsTest_noWordSplitted(){
        SplittedWordsFinder.vocabulary = new HashSet<>(Arrays.asList("Given", "in", "to", "of", "find", "which", "from",
                "vocabulary", "can", "word", "s", "segmented", "sequence"));
        List<String> expected = new ArrayList<>(); //Emty list
        assertEquals(expected, swf.findSplittedWords());
        System.out.println(swf.findSplittedWords());
    }


}
