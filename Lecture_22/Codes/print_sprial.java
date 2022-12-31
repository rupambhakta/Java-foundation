import java.util.Scanner;

public class print_sprial {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSprialOrserMatrix(int arr[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        while (totalElement < r * c) {
            // TopRow--> reftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            // rightCol-->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;
            // bottomRow-->rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            // leftCol->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
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
        System.out.println("Imput matrix is: ");
        printArray(arr1);
        System.out.println("Sprial order matrix is: ");
        printSprialOrserMatrix(arr1, r1, c1);
    }
}
