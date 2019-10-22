import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] a){
        return mergeSort(a, a.length);
    }

    public static int[] mergeSort(int[] a, int n){
        n = a.length;
        int middle = n / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[n - middle];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = a[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = a[i + middle];
        }
        if(n == 1){
            //it is already sorted, only one element
            return a;
        }
        return merge(mergeSort(leftHalf,middle), mergeSort(rightHalf , n-middle));
    }

    // let's suppose that a and b are sorted
    public static int[] merge(int[] a, int[] b){
        int aLength = a.length;
        int bLength = b.length;
        if(aLength == 0){
            return b;
        }
        if(bLength == 0){
            return a;
        }
        if(a[0] < b[0]){
            return concatElementArray(a[0], merge(subArray(a,1), b));
        }
        else {
            return concatElementArray(b[0],merge(a, subArray(b,1)));
        }
    }

    public static int[] subArray(int[] a, int begin){
        //begin < a.length
        int[] result = new int[a.length - begin];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i + begin];
        }
        return result;
    }

    public static int[] concatElementArray(int a, int[] b){
        int bLength = b.length;
        int[] result = new int[1 + bLength];
        result[0] = a;
        for (int i = 1; i < result.length; i++) {
            result[i] = b[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {3,4,5};

        System.out.println(Arrays.toString(concatElementArray(7,b)));

        System.out.println(Arrays.toString(subArray(a,1)));

        System.out.println(Arrays.toString(merge(a,b)));
    }
}
