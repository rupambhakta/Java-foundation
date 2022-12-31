import java.util.Scanner;
// Decimal to binary
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Decimal number:");
        int decimalNumber=sc.nextInt();
        int ans=0;
        int pw=1;// Powres of 10
        while (decimalNumber>0) {
            int parity=decimalNumber%2;
            ans+=(parity*pw);
            pw*=10;
            decimalNumber/=2;

        }
        System.out.println(ans);
    }
}
