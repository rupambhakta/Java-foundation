import java.util.Scanner;

public class problem_5 {
    public static void printAllCombinations(int remainingChars, String ans) {
        if (remainingChars == 0) {
            System.out.println(ans);
            return;
        }
        printAllCombinations(remainingChars - 1, ans + "-");
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) == '-') {
            printAllCombinations(remainingChars - 1, ans + "*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllCombinations(n, "");
    }
}
