import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveFinderNotEffective {
    /*
    Given an unsorted integer array, find the first missing positive integer.
    For example, given [1,2,3,4,0] return 5 and [3,2,5,-1,1] return 4.

    A O(n) time and O(n) extra space solution:
     */
    public int findFristPositive(int[] array){

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 ){
                set.add(array[i]);
            }
        }
        for (int i = 1; i <= array.length + 1; i++) {
            if(set.contains(i)){
                continue;
            }
            else return i;
        }
        return 0;
        }

}
