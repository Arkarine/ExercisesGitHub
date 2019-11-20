import java.util.Arrays;

public class IsThere2Elements {
    /*
    Check if there exist two elements in an sorted array
    whose product is equal to the given number
    O(n logn)
    Let's suppose m1*m2=a => {m1<=sqrt(a), m2>=sqrt(a)} or {m2<=sqrt(a), m1>=sqrt(a)}

     */

    public boolean isThereInArray(int[] arr, int a){
        Arrays.sort(arr);
        int sqrt = (int)Math.sqrt(a);

        /*
        int m1 = 1;
        int m2 = 1;
        for (int i = 0; arr[i] <= sqrt; i++) {
            if(a % arr[i] == 0){
                m1 = arr[i];
                int dev = a / m1;
                for (int j = arr.length-1; arr[j] >= sqrt; j--){
                    if(arr[j] == dev){
                        m2 = arr[j];
                    }
                }
            }
        }

       if((m1 != 1) && (m2 != 1)){
            return true;
        }
        return false;
        */
        //--------------------------------------------

        int i = 0;
        int res = 0;
       while(i < arr.length && arr[i] <= sqrt){
           if(a % arr[i] == 0){
               res = Arrays.binarySearch(arr, i + 1, arr.length, a / arr[i]);
           }
           i+=1;
       }

       if(res >= 0){
           return true;
       }
       return false;
    }

    public static void main(String[] args) {
        IsThere2Elements ite = new IsThere2Elements();
        int[] inputArr = {2, 8, 9, 6, 5, 4 };
        int a = 72;
        System.out.println(ite.isThereInArray(inputArr, a));
    }
}
