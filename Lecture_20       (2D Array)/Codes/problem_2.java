import java.util.Arrays;
import java.util.Scanner;

public class problem_2 {
    static void print_1d_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void print_2D_array(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        int nm = n * m;
        System.out.println("Your array size will be: " + nm);
        int arr[] = new int[nm];
        System.out.println("put values on array: ");
        for (int i = 0; i < nm; i++) {
            System.out.println("Enter " + (i + 1) + " no element: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int index=0;
        int arr_1[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_1[i][j] = arr[index];
                index++;
            }
        }
        print_1d_array(arr);
        print_2D_array(arr_1, n, m);
    }
}
