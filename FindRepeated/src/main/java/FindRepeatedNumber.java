
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class FindRepeatedNumber {
    //*********************    O(Nlog(N))
    public static int findRepatedUsingSort(int[] arr, int N){

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
    //************************************* O(?)

    public static int findRepatedUsingStream(Integer[] arr, int N){
        // each element of arr  1<=element<=N
        Map<Integer, Long> longMap = Arrays.stream(arr)
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));
        for (int i = 1; i <= N; i++) {
            if(longMap.get(i) >1){
                return i;
            }
        }
        return 0;
    }

    //******************THE BEST SOLUTION*********************      O(N)
    public static int findRepatedUsingArrayOfBoolean(int[] arr, int N){
        boolean[] booleans = new boolean[N+1];
        // arr[N+1]
        for (int i = 0; i <= N ; i++) {
            if(booleans[arr[i]]){
                return arr[i];
            }
            else {
                booleans[arr[i]] = true;
            }
        }
        return 0;
    }
    //**********************************************      O(N)
    public static int findRepatedUsingHashmap(int[] arr){
        Integer[] newArray = new Integer[arr.length];
        for (int j = 0; j < arr.length; j++) {
            newArray[j] = Integer.valueOf(arr[j]);
        }
        Map<Integer, Integer> mapInt = new HashMap<Integer, Integer>();   // key = element of array, value = the quantity of element in array

        for (int i = 0; i < newArray.length; i++) {
            if(mapInt.get(newArray[i]) == null){
                mapInt.put(newArray[i], 1);
            }
            else {
                Integer quantity = mapInt.get(newArray[i]);
                mapInt.put(newArray[i], quantity + 1);
            }
        }
        for (Integer i : mapInt.keySet()) {
            if(mapInt.get(i) > 1 ){
                return i.intValue();
            }
        }
        return  0;
    }

}
