import java.util.Scanner;

public class problem_1 {
    static String margeString(String a, String b) {
        String ans = "";
        if (a.length() == 0) {
            ans += b;
            return ans;
        }
        if (b.length() == 0) {
            ans += a;
            return ans;
        }
        ans += a.substring(0, 1);
        ans += b.substring(0, 1);
        ans += margeString(a.substring(1, a.length()), b.substring(1, b.length()));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firsr string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println(margeString(s1, s2));
    }
}
