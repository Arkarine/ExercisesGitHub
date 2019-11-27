import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

    /*
    Check if there exist two elements in an sorted array
    whose product is equal to the given number
    O(n)
     */

public class IsThere2ElementsEffective {
    public boolean isThereInArray(int[] arr, int a){
        Arrays.sort(arr);
        LinkedList<Integer> que = new LinkedList<>();
        for (int i = 0; i < arr.length && arr[i] < a ; i++) {
            if(a % arr[i] == 0){
                que.add(arr[i]);
            }
        }

        while (que.size() > 1){
            if(que.getFirst() * que.getLast() > a){
                que.removeLast();
            }
            else if(que.getFirst() * que.getLast() < a){
                que.removeFirst();
            }
            else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsThere2ElementsEffective ite = new IsThere2ElementsEffective();
        int[] inputArr = {2, 8, 9, 6, 5, 4 };
        int a = 72;
        System.out.println(ite.isThereInArray(inputArr, a));

        int[] inputArr1 = {2, 7, 9, 6, 5, 4 };
        int a1 = 72;
        System.out.println(ite.isThereInArray(inputArr1, a1));
    }
}
