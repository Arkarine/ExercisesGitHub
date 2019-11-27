public class FirstMissingPositiveFinder {
    /*
    Given an unsorted integer array, find the first missing positive integer.
    For example, given [1,2,3,4,0] return 5 and [3,2,5,-1,1] return 4.
    Algorithm should run in O(n) time and uses constant space.

    A O(n) time and O(1) extra space solution:
     */
    public int findFristPositive(int[] array){

        //The goal array[i] = i +1 => array[i] = array[array[i] - 1]

        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {

            while (array[i] != i+1){
                if(array[i] <= 0 || array[i] >= n){
                    break;
                }
                //duplicate elements
                if(array[i] == array[array[i]-1]){
                    break;
                }
                //swap  array[i] and array[array[i] - 1]

                temp = array[i];
                array[i] = array[temp - 1];
                array[temp -1 ] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] != i + 1){
                return i + 1;
            }
        }
        return n+1;
    }
}
