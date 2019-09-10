public class MinTenDegree {
    public static void main(String[] args) {
        System.out.println(findMin(99));
    }
    /*
    n E [1, 1000000000]
    Find the min non negative int, that contains the same quantity of digits.
     */
    /*
    For example
    1 -> 0
    9 -> 0
    10 -> 10
    99 -> 10
     */

    public static int findMin(int number){
        int count = String.valueOf(number).length();
        if (count == 1){
            return 0;
        }
        else {
            return (int)Math.pow(10, count -1);
        }
    }
}
