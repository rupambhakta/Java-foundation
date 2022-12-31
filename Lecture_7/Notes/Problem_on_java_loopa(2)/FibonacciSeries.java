import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int num=0;
        for(int i=1;i<=n;i++){
            num=num+i;
            System.out.println(num);
        }
    }
}
