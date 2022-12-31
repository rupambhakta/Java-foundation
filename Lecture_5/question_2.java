import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x=sc.nextInt();
        
        System.out.println("Enter 2st number: ");
        int y=sc.nextInt();
        
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        
        System.out.println("After swapying....");

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
