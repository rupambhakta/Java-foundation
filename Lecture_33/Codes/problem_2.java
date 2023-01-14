import java.util.Arrays;
import java.util.Scanner;

public class problem_2 {
    // static void print_array(int arr[], int idx) {
    //     if (idx == arr.length) {
    //         return;
    //     }
    //     System.out.println(arr[idx] + " ");
    //     print_array(arr, idx + 1);

    // }

    static void triagnle(int arr[]) {
        if (arr.length < 1) {
            return;
        }
        int arr_1[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr_1[i] = arr[i] + arr[i + 1];
        }
        triagnle(arr_1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " no elements: ");
            arr[i] = sc.nextInt();
        }
        // int arr_2[] = { 1, 2, 3, 4, 5 };
        triagnle(arr);
    }
}
