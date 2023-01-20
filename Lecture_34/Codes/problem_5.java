import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(rec(str, str.length() - 1));
    }

    public static int rec(String str, int n) {
        if (n == 0) {
            return str.charAt(0) - '0';
        }
        return (rec(str, n - 1) * 10 + str.charAt(n) - '0');
    }
}