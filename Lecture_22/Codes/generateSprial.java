import java.util.Scanner;

public class generateSprial {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSprialOrserMatrix(int n) {
        int arr[][]=new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current<=n*n) {
            // TopRow--> reftCol to rightCol
            for (int j = leftCol; j <= rightCol && current<=n*n; j++) {
                arr[topRow][j]=current;
                current++;
               
            }
            topRow++;
            // rightCol-->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current<=n*n; i++) {
                arr[i][rightCol] =current;
                current++;
            }
            rightCol--;
            // bottomRow-->rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current<=n*n; j--) {
                arr[bottomRow][j]=current;
                current++;
            }
            bottomRow--;
            // leftCol->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current<=n*n; i--) {
                arr[i][leftCol]=current;
                current++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=sc.nextInt();
        int ans[][]=generateSprialOrserMatrix(n);
        printArray(ans);
    }
}
