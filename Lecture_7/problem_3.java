//Reverce of a given number
import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int ans=0;
        while (n>0) {
            int remender=n%10;
            ans=ans*10+remender;
            n/=10;
        }
        System.out.println(ans);
    }
}
