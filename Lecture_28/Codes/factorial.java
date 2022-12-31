import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
        // int smallProblem=factorial(n-1);
        // int ans=n*smallProblem;
        // return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println("The factorial of "+n+" is "+ans);
    }
}
