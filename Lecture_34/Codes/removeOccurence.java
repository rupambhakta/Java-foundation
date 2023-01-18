import java.util.Scanner;

public class removeOccurence {
    static String removeA2(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = removeA2(s.substring(1));
        char currentCharacter = s.charAt(0);

        if (currentCharacter != 'a') {
            return currentCharacter + smallAns;
        } else {
            return smallAns;
        }
    }

    static String RemoveA(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallAns = RemoveA(s, idx + 1);
        char currentCharacter = s.charAt(idx);

        if (currentCharacter != 'a') {
            return currentCharacter + smallAns;
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(RemoveA(s, 0));
        System.out.println(removeA2(s));
    }
}
