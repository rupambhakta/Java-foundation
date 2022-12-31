import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] gain = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            gain[i] = scn.nextInt();
        }
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            ans[i] = ans[i - 1] + gain[i - 1];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n + 1; i++) {
            max = Math.max(max, ans[i]);
        }
        System.out.println(max);
    }
}
