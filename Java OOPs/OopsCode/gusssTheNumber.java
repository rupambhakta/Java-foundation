import java.util.Random;
import java.util.Scanner;

public class gusssTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, gusses, Ngusses = 1;
        Random random = new Random();
        number = random.nextInt(100) + 1;
        System.out.println("Enter anumber in bwtween 1 to 100");
        do {
            gusses = sc.nextInt();
            if (gusses > number) {
                System.out.println("Lower number please!");
            } else if (gusses < number) {
                System.out.println("Higher number please!");
            } else {
                System.out.println("You gussed in " + Ngusses + " attempts.");
            }
            Ngusses++;
        } while (gusses != number);
    }
}
