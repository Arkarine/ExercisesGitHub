import java.util.ArrayList;
import java.util.List;

public class MaxQuantityDifferentNum {
    int quantity;
    public List<Integer> findMaxQuantity(int N){  //N > 0
        List<Integer> result = new ArrayList<>();
        quantity = 0;
        for (int j = 1; j <= N; j++) {
            if(N - j >= j+1 ){
                N = N - j;
                quantity ++;
                result.add(j);
            }
            else {
                result.add(N);
                quantity ++;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MaxQuantityDifferentNum mqdn = new MaxQuantityDifferentNum();

        System.out.println(mqdn.findMaxQuantity(6));
        System.out.println(mqdn.quantity);
        System.out.println(mqdn.findMaxQuantity(8));
        System.out.println(mqdn.quantity);
        System.out.println(mqdn.findMaxQuantity(2));
        System.out.println(mqdn.quantity);
        System.out.println(mqdn.findMaxQuantity(1));

    }
}
