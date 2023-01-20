import java.util.Scanner;

public class problem_2 {
    static String upperCase(String s, int index) {
        if (index == s.length()) {
            return "";
        }
        if (Character.isUpperCase(s.charAt(index))) {
            return s.substring(index);
        }
        return upperCase(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.println(upperCase(s1, 0));
    }
}
