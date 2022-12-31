import java.util.Scanner;

public class read_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a cherecter: ");
        char ch = sc.next().charAt(5);
        System.out.println("Chetecter is  "+ch);
    }
}
