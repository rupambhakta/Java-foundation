import java.util.Scanner;

public class additionOfTwoMatrix {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input. Addition not possible.");
            return;
        }
        System.out.println("Sum of two matrix is: ");
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put values in firat matrix: ");
        System.out.println("Enter row number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter colums number: ");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " element in array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter " + (i + 1) + " no row element: ");
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Put values in 2nd rows: ");
        System.out.println("Enter row number: ");
        int r2 = sc.nextInt();
        System.out.println("Enter colums number: ");
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " element in array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter " + (i + 1) + " no row element: ");
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix_1: ");
        printArray(arr1);
        System.out.println("Matrix_2: ");
        printArray(arr2);
        
        add(arr1, r1, c1, arr2, r2, c2);
    }
}
