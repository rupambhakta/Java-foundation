import java.util.Scanner;

public class problem_1 {

    static void printArray(int arr[]) {
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        // int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int arr[] = new int[n];
        System.out.println("Enter valus on array : ");
        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }
        int arr_2[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr_2[index] = arr[i];
                index++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                arr_2[index] = arr[j];
                index++;
            }
        }
        printArray(arr);
        System.out.println("Afer sorting : ");
        printArray(arr_2);
    }
}
