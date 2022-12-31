import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int a = sc.nextInt();
        int sum = 0;
        if (a < 0) {
            sum = a * (-1);
            System.out.println("The absolute value that you entered is " + sum);
        }
         else {
            System.out.println("The absolute value that you entered is " + a);
        }
    }
}
