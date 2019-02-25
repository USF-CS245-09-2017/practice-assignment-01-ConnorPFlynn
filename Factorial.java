public class Factorial {
    private static String type;

    public int factorial(int n, String type) {
        if (type == "iterative")
            return factorialIterative(n);
        else if (type == "recursive")
            return factorialRecursive(n);
        else return -1;
    }

    public int factorialIterative(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            final int i;
            i = n * factorialRecursive(n - 1);
            return i;
        }
    }
}


