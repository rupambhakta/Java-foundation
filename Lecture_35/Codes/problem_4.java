import java.util.Scanner;
// Q4. Given an input strinS of diSits, find all combinations of numbers that can be formed usinS diSits in the 
// same order.
public class problem_4 {
    public static void printAllCombinations(String nums, int idx, String ans) {
        if (idx == nums.length()) {
            System.out.println(ans);
            return;
        }
        printAllCombinations(nums, idx + 1, ans + Character.toString(nums.charAt(idx)));
        if (idx != nums.length() - 1)
            printAllCombinations(nums, idx + 1, ans + Character.toString(nums.charAt(idx)) + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        printAllCombinations(nums, 0, "");
    }
}
