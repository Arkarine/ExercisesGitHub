import java.util.HashMap;
import java.util.Map;

public class RepeatedElementFinder {
    /*
    Есть массив int. Определить, есть ли в нем элемент,
    повторяющийся более половины раз (строго больше) например, {1,2,3,1,1}

    ввод массив, вывод boolean
     */
    public boolean findRepeatedElemet(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            }
            else{
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            }
        }
        int halfLength = arr.length / 2;

        for (Integer key : map.keySet()) {
            if(map.get(key) > halfLength ){
                return true;
            }
        }
        return false;
    }
}
