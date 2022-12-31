import java.util.Scanner;

public class prifixSum {
    static void printArray(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrifixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i -1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put value on array: ");
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter " + (i + 1) + " element : ");
        // arr[i] = sc.nextInt();
        // }
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + (i) + " element : ");
            arr[i] = sc.nextInt();
        }
        // printArray(arr);
        int pref[] = makePrifixSumArray(arr);
        printArray(pref);

        // problem 2.........

        System.out.println("Enter number of queary: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter l : ");
            int l = sc.nextInt();
            System.out.println("Enter r  : ");
            int r = sc.nextInt();
            int ans = pref[r] - pref[l - 1];
            System.out.println(ans);
        }
    }
}
