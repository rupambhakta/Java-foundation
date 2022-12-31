import java.util.Arrays;
import java.util.Scanner;

public class problem_1 {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put value on array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter size of teh sub array: ");
        int m = sc.nextInt();
        Arrays.sort(arr);
        printArray(arr);
        int lsum1 = 0;
        int rsum1 = 0;
        int i = 0;
        while (i < m) {
            lsum1 = lsum1 + arr[i];
            i++;
        }
        i = n - 1;
        while (i < n) {
            rsum1 = rsum1 + arr[i];
            i++;
        }

        int diff1 = Math.abs(lsum1 - rsum1); // diff when m size subarray contains min elements
        int lsum2 = 0;// calculate sum for both parts from right end with subarray of size m having
                      // max elements
        int rsum2 = 0;
        int j = n - 1;
        while (j >= n - m) {
            rsum2 += arr[j];
            j--;
        }
        while (j >= 0) {
            lsum2 += arr[j];
            j--;
        }
        int diff2 = Math.abs(lsum2 - rsum2);// diff when m size subarray contains min elements
        System.out.print(Math.max(diff1, diff2));
    }
}
