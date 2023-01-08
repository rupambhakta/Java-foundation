import java.util.Scanner;

public class gcd_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        int min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        for (int i = min; i <0; i--) {
            if (x % min == 0 && y % min == 0) {
                System.out.println("The GCD of x and y is: " + min);
                return;
            }
        }
    }
}
