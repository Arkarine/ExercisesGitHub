public class Fibonacci {

    // Find N th Fibonacci number

    public long N_Fibonacci (int N){
        long[] FibonacciArray = new long[N+1];
        FibonacciArray[0] = 0;
        FibonacciArray[1] = 1;
        for (int i = 2; i <= N; i++) {
            FibonacciArray[i] = FibonacciArray[i-1] + FibonacciArray[i-2];
        }
        return FibonacciArray[N];
    }
}
