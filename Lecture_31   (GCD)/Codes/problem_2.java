import java.util.Scanner;

public class problem_2 {
    static int product(int x, int n) {
        if (n == 0) {
            return 0;
        }
        return product(x, n-1)+x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println("The peoduct is: "+product(x, y));
    }
}
