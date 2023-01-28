import java.util.Scanner;
import java.util.ArrayList;

public class assignmentQuestion_3 {
    public static void printCombinationsOdd(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + "*" + num2);
                System.out.println(num1 + "-" + num2);
            }
        }
    }

    public static void printCombinationsEven(ArrayList<String> nums) {
        for (String num1 : nums) {
            for (String num2 : nums) {
                System.out.println(num1 + num2);
            }
        }
    }

    public static void generateStrings(int remainingBits, ArrayList<ArrayList<String>> nums, int numberOfStars,
            String curr) {
        if (remainingBits == 0) {
            nums.get(numberOfStars).add(curr);
            return;
        }
        generateStrings(remainingBits - 1, nums, numberOfStars + 1, curr + "*");
        generateStrings(remainingBits - 1, nums, numberOfStars, curr + "-");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<String>> nums = new ArrayList<ArrayList<String>>();
        for (int i = 0; i <= n; i++) {
            nums.add(new ArrayList<String>());
        }
        generateStrings(n / 2, nums, 0, "");
        if (n % 2 == 1)
            for (int s = 0; s <= n; s++)
                printCombinationsOdd(nums.get(s));
        else
            for (int s = 0; s <= n; s++)
                printCombinationsEven(nums.get(s));
    }
}