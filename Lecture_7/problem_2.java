//Sum of the elements of a given number
import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       while(n>0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }
}
