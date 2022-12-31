import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            height[i] = scn.nextInt();
        }
        int i = 0;
        int j = n - 1;
        int ans = 0;
        while (i < j) {
            int width = j - i;
            int ht = Math.min(height[i], height[j]);
            int area = ht * width;
            ans = Math.max(ans, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(ans);
    }
}