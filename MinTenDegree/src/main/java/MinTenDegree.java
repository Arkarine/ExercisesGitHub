public class MinTenDegree {
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

    public static int findMin1(int number){
        int count = String.valueOf(number).length();
        if (count == 1){
            return 0;
        }
        else {
            return (int)Math.pow(10, count -1);
        }
    }

    //------------------Better-------------------
    public static int findMin(int number){

        int count = countOfDigit(number);
        if (count == 1){
            return 0;
        }
        else {
            return (int)Math.pow(10, count - 1);
        }
    }

    public static int countOfDigit(int number){
        int count = 0;
        while(number != 0){
            number = number / 10;
            count ++;
        }
        return count;
    }
    //---------------------complicated--------------------
    /*
    public static int CountOfDigit(int number){
       if(number == 0 ){
           return 0;
       }
        int n = 1;
        while (true){
            if(number < Math.pow(10, n) && number > Math.pow(10, n-1)){
                return n;
            }
            n++;
        }
    }
    */



}
