import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=scn.nextLine();
        System.out.println("Enter your interest: ");
        String c=scn.nextLine();
        System.out.println("Enter your roll no.: ");
        int b=scn.nextInt();

        System.out.println("Your name is : "+a);
        System.out.println("Your roll no is : "+b);
        System.out.println("Your interest is : "+c);
    }
}
