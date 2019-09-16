import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TextFullSplitterTest {

    //public String text = "to toget together, the. sequence contains, any surrogate pairs java idea text main";
    public String text = "to toget together, the. seq sequence cont contains, any surrogate pairs java idea text main";
    String[] dicArray = text.replaceAll(",", "").replaceAll("\\.", "").split(" ");
    Set<String> dicSet = new HashSet<String>(Arrays.asList(dicArray));

    @Test
    public void divideTest(){
        TextFullSplitter.dictionary = dicSet;
        String input = "togetherthesequencecontainsanysurrogatepairs";
        List<String> result = new ArrayList<String>(Arrays.asList("together", "the", "sequence", "contains", "any", "surrogate", "pairs"));
        assertEquals(result, TextFullSplitter.divide(input));
        System.out.println(TextFullSplitter.divide(input));
    }

    @Test
    public void divideTest_forOneWord(){
        TextFullSplitter.dictionary = dicSet;
        String input = "toget";
        List<String> result = new ArrayList<String>(Arrays.asList("toget"));
        assertEquals(result, TextFullSplitter.divide(input));
        System.out.println(TextFullSplitter.divide(input));
    }

    @Test
    public void divideTest_forNotDividedString(){
        TextFullSplitter.dictionary = dicSet;
        String input = "togetdddd";
        List<String> result = new ArrayList<String>();   // Empty list
        assertEquals(result, TextFullSplitter.divide(input));
        System.out.println(TextFullSplitter.divide(input));
    }

    @Test
    public void divideTest_together_atTheEnd(){
        TextFullSplitter.dictionary = dicSet;
        String input = "thesequencecontainsanysurrogatepairstogether";
        List<String> result = new ArrayList<String>(Arrays.asList( "the", "sequence", "contains", "any", "surrogate", "pairs", "together"));
        assertEquals(result, TextFullSplitter.divide(input));
        System.out.println(TextFullSplitter.divide(input));
    }

    @Test
    public void divideTest_OneWordDictionary(){
        TextFullSplitter.dictionary = new HashSet<String>(Arrays.asList("together"));
        String input = "togetherthesequencecontainsanysurrogatepairs";
        List<String> result = new ArrayList<String>();   // Empty list
        assertEquals(result, TextFullSplitter.divide(input));
        System.out.println(TextFullSplitter.divide(input));
    }
}