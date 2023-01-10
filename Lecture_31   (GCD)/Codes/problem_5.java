import java.util.Scanner;

// Q5 - Given the Binary code of a number as a decimal number, we need to convert this into its 
// equivalent Gray Code. In gray code, only one bit is changed in 2 consecutive numbers.
//  Hint: The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given 
// binary code and other bits of the output gray code can be obtained by XORing binary code bit 
// at that index and previous index.
public class problem_5 {
    public static int binary_to_gray(int n, int i) {
        int a, b;
        int result = 0;
        if (n != 0) {
                // Taking last digit
                a = n % 10;
                n = n / 10;
                // Taking second last digit
                b = n % 10;
                if ((a & ~b) == 1 || (~a & b) == 1) {
                        result = (int)(result + Math.pow(10, i));
                }
                return binary_to_gray(n, ++i) + result;
        }
        return 0;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int n=sc.nextInt();
        System.out.println(binary_to_gray(n, 0));
    }
}
