import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Bynary number:");
        int binaryNumber=sc.nextInt();
        int ans=0;
        int pw=1;
        while (binaryNumber>0) {
            int unitDigit=binaryNumber%10;
            ans=ans+(unitDigit*pw);
            binaryNumber/=10;
            pw*=2;

        }
        System.out.println("The decimal number is : "+ans);
    }
}
