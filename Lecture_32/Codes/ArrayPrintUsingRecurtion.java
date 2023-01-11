import java.util.Scanner;

public class ArrayPrintUsingRecurtion {
    static void print_array(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(arr[idx] + " ");
        print_array(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the " + (i + 1) + " no elements: ");
            arr2[i] = sc.nextInt();
        }
        // int arr[] = { 1, 3, 4, 5, 6, 7 };
        print_array(arr2, 0);
    }
}
