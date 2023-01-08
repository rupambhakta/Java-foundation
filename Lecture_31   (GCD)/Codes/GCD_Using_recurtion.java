import java.util.Scanner;

public class GCD_Using_recurtion {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        System.out.println("The gcd of x and y is: "+gcd(x, y));
    }
}
