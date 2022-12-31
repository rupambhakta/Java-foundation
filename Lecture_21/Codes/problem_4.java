import java.util.Scanner;

public class problem_4 {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
        printArray(arr);
        int[] arr2 = new int[r * c];
        int idx = 0;
        int row = 0;
        int col = 0;
        while (col < c) {
            int i = row;
            int j = col;
            while (i >= 0 && j < c) {
                arr2[idx] = arr[i][j];
                idx++;
                i--;
                j++;
            }
            row++;
            if (row >= r) {
                row = r - 1;
                col++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
