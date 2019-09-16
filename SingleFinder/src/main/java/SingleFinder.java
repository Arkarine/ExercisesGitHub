import java.util.HashMap;
import java.util.Map;

public class SingleFinder {
    // It is given an array
    // Lenghth of array is odd = 2n+1
    // In array there are n pair and one single
    // Find single
    public static int findSingle1(int[] arr){
        //convert array of int to array of Integer
        Integer[] arrInt = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //arrInt[i] = Integer.valueOf(arr[i]);
            arrInt[i] = arr[i];
        }
        // key = element of array, value = quantity of element in array
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arrInt.length; i++) {
            if (map.get(arrInt[i]) == null){
                map.put(arrInt[i], 1);
            }
            else {
                Integer quantity = map.get(arrInt[i]);
                map.put(arrInt[i], quantity + 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) % 2 != 0){
                return i;
            }
        }
        return 0;
    }
    // Another solution with xor

    // a^a = 0
    // a^0 = a
    // a^b^a = b

    public static int findSingle(int[] arr){
        int res = 0;
        for (int i : arr) {
           res ^= i;
        }
        return res;
    }

}
