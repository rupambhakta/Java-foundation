import java.util.Scanner;

public class sum_of_digits {
    public static void CheckSumOfDigit(int n){
        int sum = 0;
        while(n!=0){
            int a = n%10;
            n = n/10;
            sum+=a;
        }
        System.out.println("Sum of digit = "+sum);
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CheckSumOfDigit(n);
    }
}
