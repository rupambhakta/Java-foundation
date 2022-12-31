import java.util.Scanner;

public class problem_1 {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void prifixMatrix(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }
    /* 
    for(int i = 0;i<n;i++)
    {
        for (int j = 1; j < m; j++) {
            a[i][j] += a[i][j - 1];
        }
    }
    // vertical prefix sum
    for(int j = 0;j<m;j++)
    {
        for (int i = 1; i < n; i++) {
            a[i][j] += a[i - 1][j];
        }
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put values in firat matrix: ");
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
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Prifix Array: ");
        prifixMatrix(arr, r, c);
        printArray(arr);
    }
}
