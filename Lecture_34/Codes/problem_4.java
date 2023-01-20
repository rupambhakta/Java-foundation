import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(totallowercase(str, 0));
    }

    public static int totallowercase(String str, int idx) {
        if (idx == str.length() - 1) {
            if (str.charAt(idx) >= 97 && str.charAt(idx) <= 122) {
                return 1;
            } else {
                return 0;
            }
        }
        if (str.charAt(idx) >= 97 && str.charAt(idx) <= 122) {
            return totallowercase(str, idx + 1) + 1;
        } else {
            return totallowercase(str, idx + 1);
        }
    }
}
