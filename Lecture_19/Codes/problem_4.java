import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        int[] left = new int[n];
        left[0] = 0;
        int[] right = new int[n];
        right[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}