import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pricipal: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter time: ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        System.out.println("Principal = " + p);
        System.out.println("Interest rate = " + r);
        System.out.println("Time = " + t);
        System.out.println("Simple interest is " + si);
    }
}
