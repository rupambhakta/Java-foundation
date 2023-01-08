import java.util.Scanner;

public class problem_1 {
    static int count(int n) {
        if (n >= 10) {
            return count(n / 10) + 1;
        }

        // base case: only one digit
        return 1;
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return pow(a, b / 2) * pow(a, b / 2);
        return a * pow(a, b / 2) * pow(a, b / 2);
    }

    public static int armstrong(int n, int dig) {
        if (n == 0)
            return 0;
        return pow(n % 10, dig) + armstrong(n / 10, dig);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number to check armstrong or not:");
        int n = sc.nextInt();
        int c = count(n);
        System.out.println("The number of digit present in n is: " + count(n));
        if (n == armstrong(n, c))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
