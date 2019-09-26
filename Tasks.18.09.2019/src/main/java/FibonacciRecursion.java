public class FibonacciRecursion {

    public long findFibonacci(int number){  //number >= 0
        if(number == 1){
            return 1;
        }
        if(number == 0){
            return 0;
        }
        //prev1 -> prev2 -> res
        long prev1 = 0;
        long prev2 = 1;
        long res = 0;

        if(number > 1){
            for (int i = 2; i <= number; i++) {
                res = prev1 + prev2;
                prev1 = prev2;
                prev2 = res;
            }
        }
        return res;
    }

    //---------------Effective Recursion-------------------
    public static long fibonacciRec(int n) {
        return findFibonacciRec(n, new long[n + 1]);
    }

    private static long findFibonacciRec(int number, long[] result){

        if(number <= 1){
            return number;
        }

        if(result[number] == 0 ){
            result[number] = findFibonacciRec(number - 1 , result) + findFibonacciRec(number-2 , result);
            //System.out.println(result[number]);
        }
        return result[number];
    }
}
