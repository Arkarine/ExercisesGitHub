import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {
    @Test
    public void sortTest_common(){
        int[] c = {8,5,2,6,3,7,1};
        int[] result = {1, 2, 3, 5, 6, 7, 8};
        assertTrue(Arrays.equals(result, MergeSort.sort(c)));
    }

    @Test
    public void sortTest_repeated(){
        int[] d = {3,20,9,3,8,47,6};
        int[] result = {3, 3, 6, 8, 9, 20, 47};
        assertTrue(Arrays.equals(result, MergeSort.sort(d)));
    }

    @Test
    public void sortTest_single(){
        int[] d = {3};
        int[] result = {3};
        assertTrue(Arrays.equals(result, MergeSort.sort(d)));
    }
}
