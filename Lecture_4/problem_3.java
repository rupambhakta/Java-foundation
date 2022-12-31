import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first marks: ");
        int a= sc.nextInt();
        System.out.print("Enter second marks: ");
        int b= sc.nextInt();
        System.out.print("Enter third marks: ");
        int c= sc.nextInt();
        int d=a+b+c;
        System.out.println("Total marks is : "+ d);
        System.out.println("Persentage of your total marks is : "+ d/3);
    }
}
