import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class FindRepeatedNumberTest {
    @Test
    public void findRepatedUsingSortTest(){
        int[] array = {1,2,1}; //N=2 ->array[N+1], each element from [1,N]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingSort(array, 2));
    }
    @Test
    public void findRepatedUsingSort_forOne(){
        int[] array = {1,1}; //N=1 ->array[2] [1,1]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingSort(array, 1));
    }
    //**********************************************
    @Test
    public void findRepatedUsingStreamTest(){
        Integer[] array = {1,2,1}; //N=2 ->array[N+1], each element from [1,N]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingStream(array, 2));
    }
    @Test
    public void findRepatedUsingStream_forOne(){
        Integer[] array = {1,1}; //N=1 ->array[2] [1,1]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingStream(array, 1));
    }
    //***********************************************
    @Test
    public void findRepatedUsingArrayOfBooleanTest(){
        int[] array = {1,2,1}; //N=2 ->array[N+1], each element from [1,N]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingArrayOfBoolean(array, 2));
    }
    @Test
    public void findRepatedUsingArrayOfBoolean_forOne(){
        int[] array = {1,1}; //N=1 ->array[2] [1,1]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingArrayOfBoolean(array, 1));
    }
    //***********************************
    @Test
    public void findRepatedUsingHashmapTest(){
        int[] array = {1,2,1}; //N=2 ->array[N+1], each element from [1,N]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingHashmap(array));
    }
    @Test
    public void findRepatedUsingHashmap_forOne(){
        int[] array = {1,1}; //N=1 ->array[2] [1,1]
        assertEquals(1, FindRepeatedNumber.findRepatedUsingHashmap(array));
    }

}
