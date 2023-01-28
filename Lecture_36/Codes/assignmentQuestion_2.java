import java.util.Scanner;
import java.util.ArrayList;

public class assignmentQuestion_2 {
    public static void printCombinations(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + num2);
            }
        }
    }

    public static void generateStrings(int remainingChars, ArrayList<ArrayList<String>> nums, int numberOfStars,
            String curr) {
        if (remainingChars == 0) {
            nums.get(numberOfStars).add(curr);
            return;
        }
        generateStrings(remainingChars - 1, nums, numberOfStars + 1, curr + "*");
        generateStrings(remainingChars - 1, nums, numberOfStars, curr + "-");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<String>> nums = new ArrayList<ArrayList<String>>();
        for (int i = 0; i <= n; i++) {
            nums.add(new ArrayList<String>());
        }
        generateStrings(n, nums, 0, "");
        for (int s = 0; s <= n; s++) {
            printCombinations(nums.get(s));
        }
    }
}
