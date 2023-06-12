// package Recurrsion;

public class fibbo {

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));

    }
}
