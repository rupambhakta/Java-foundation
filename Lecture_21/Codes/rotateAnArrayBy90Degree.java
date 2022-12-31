import java.util.Scanner;

public class rotateAnArrayBy90Degree {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInplace(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int arr[]) {
        int i = 0, j = (arr.length - 1);
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int arr[][], int r) {
        // Given Matrix will be squre.
        /*
         * step 1: transpose the array.
         * step 2: reverse all the rowa of the rranspose matrix.
         */
        transposeInplace(arr, r, r);
        for (int i = 0; i < r; i++) {
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int r = sc.nextInt();
        System.out.println("Enter colums number: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " element in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " no row element: ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Initial matrix is: ");
        printArray(arr);
        System.out.println("The 90 degaree rotared matrix is :  ");
        rotate(arr, r);
        printArray(arr);
    }
}
