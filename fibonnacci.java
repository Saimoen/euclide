public class fibonnacci {
    public static int par_iterative(int n) {
        if(n < 2) {
            return n;
        } else {
            int Fib_2 = 0;
            int Fib_1 = 1;
            int Fib = 0;
            for (int i = 2; i <= n; i++) {
                Fib = Fib_2 + Fib_1;
                Fib_2 = Fib_1;
                Fib_1 = Fib;
            }
            return Fib;
        }
    }

    public static int par_recursive(int n) {
        return n < 2 ? n : par_recursive(n-1) + par_recursive(n-2);
    }
}
