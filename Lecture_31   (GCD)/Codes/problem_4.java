import java.util.Scanner;

public class problem_4 {
    static int decimalToBinaryConvertion(int n) {
     if (n == 0)
            return 0;
        else
            return (n % 2 + 10 * decimalToBinaryConvertion(n / 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        System.out.println(decimalToBinaryConvertion(n));
    }
}
