import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lengrth: ");
        int a=sc.nextInt();
        System.out.println("Enter breath: ");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("Its a Sqeare.");
        }
        else{
            System.out.println("Its a rectengal.");
        }
    }
}
