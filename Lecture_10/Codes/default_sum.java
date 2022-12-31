import java.util.Scanner;

public class default_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int a = sc.nextInt();

        System.out.print("Enter a binary number:");
        int binaryNumber = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (binaryNumber > 0) {
            int unitDigit = binaryNumber % 10;
            ans = ans + (unitDigit * pw);
            binaryNumber /= 10;
            pw *= 2;
        }
        int sum=a+ans;
        int multiply=a*ans;
        System.out.println("The desired sum is : "+sum);
        System.out.println("The desired multiply is : "+multiply);
    }
}
