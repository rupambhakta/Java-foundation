import java.util.Scanner;

public class GCD {
    static int i_gcd(int x ,int y){
        while (x%y!=0) {
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        System.out.println("The gcd of x and y is: "+i_gcd(x, y));
    }
}
