import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
        // Sub problem
        // int prev = fib(n - 1);
        // int prevPrev = fib(n - 2);
        // return prev + prevPrev;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
