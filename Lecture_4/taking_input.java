import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int num_1 = sc.nextInt();
        // System.out.println("The number is " + num_1);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Your name is "+name);
    }
}
