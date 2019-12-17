public class MinQuantity {
    /*
    Find minimum count of given numbers(10, 5, 1) whose sum equals to given number 'sum'.
    For example 28 = 10+10+5+1+1+1 => quantity = 6

     */
    public static int findMinQuantity(int sum){
        int quantity = 0;
        while(sum - 10 >= 0){
            sum = sum - 10;
            quantity = quantity +1;
        }
        while(sum - 5 >= 0){
            sum = sum - 5;
            quantity = quantity + 1;
        }
        return quantity + sum;
    }

    public static void main(String[] args) {
        System.out.println(findMinQuantity(1));
    }
}
