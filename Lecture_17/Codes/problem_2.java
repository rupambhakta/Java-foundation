import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Put element in array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+(i+1)+" no element: ");
            arr[i] = scn.nextInt();
        }
        int outofplace = -1;   // An element is out of place if it is negative and at odd index (0-based index),
                              // or if it is positive and at even index (0-based index).
        for (int index = 0; index < n; index++) {
            if (outofplace >= 0) {
                if (((arr[index] >= 0) && (arr[outofplace] < 0)) || ((arr[index] < 0) && (arr[outofplace] >= 0))) {
                    rightrotate(arr, n, outofplace, index);
                    if (index - outofplace >= 2)
                        outofplace = outofplace + 2;
                    else
                        outofplace = -1;
                }
            }
            if (outofplace == -1) { // if no entry has been flagged out-of-place
                if (((arr[index] >= 0)&& ((index & 0x01) == 0))|| ((arr[index] < 0)&& (index & 0x01) == 1))
                    outofplace = index;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rightrotate(int arr[], int n, int outofplace, int cur) {
        int tmp = arr[cur];
        for (int i = cur; i > outofplace; i--)
            arr[i] = arr[i - 1];
        arr[outofplace] = tmp;
    }
}