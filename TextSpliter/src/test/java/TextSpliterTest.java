import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TextSpliterTest {

    public String text = "under. stand, and. English free different skills interactive" +
            "Framework levels vocabulary your language European communicate, activities " +
            "work build Here written section, this, can";

    String[] dic = text.replaceAll(",", "").replaceAll("\\.", "").split(" ");
    public  Set<String> dictionary = new HashSet<String>(Arrays.asList(dic));
    @Test
    public void textSplitTest(){
        TextSpliter.dictionary = dictionary;
        String input = "understanding";
        List<String> result = new ArrayList<String>(Arrays.asList("under", "stand", "and"));
        assertEquals(result, TextSpliter.textSplit(input));

    }
}
