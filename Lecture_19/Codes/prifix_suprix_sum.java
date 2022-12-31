import java.util.Scanner;

public class prifix_suprix_sum {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findarraySum(int arr[]) {
        int totalSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPatition(int arr[]) {
        int totalSum = findarraySum(arr);
        int prifSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prifSum += arr[i];
            int suffixSum = totalSum - prifSum;
            if (suffixSum == prifSum) {
                return true;
            }
        }
        return false;
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
        System.out.println("Equal prifix possible : " + equalSumPatition(arr));
    }
}
