public class Fibonacci {
    public int fibonacci(int n, String type) {
        if (type == "recursive")
            return fibonacciRecursive(n);

        else if (type == "iterative")
            return fibonacciIterative(n);
        else {
            return -1;
        }
    }
            public int fibonacciRecursive(int n){
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else
                return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }

        public int fibonacciIterative(int n){
        if (n <= 1)
            return n;
            int n2 = 1;
            int n1 = 1;
            for (int i = 2; i < n; i++){
                int n3 = n2;
                n2 += n1;
                n1 = n3;
            }
            return n2;
        }

}
