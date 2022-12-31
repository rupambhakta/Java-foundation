import java.util.Scanner;

public class problem_5 {
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
        System.out.println("Enter a search element: ");
        int ch = sc.nextInt();
        boolean ans = true;
        for (int a = 0; a < r1; a++) {
            for (int b = 0; b < c1; b++) {
                if (arr1[a][b] == ch) {
                    System.out.println("Search found,teh index is: (" + a + " " + b + ")");
                    printArray(arr1);
                    break;
                } else {
                    ans = false;
                }

            }
        }
        if (ans == false) {
            System.out.println("Search not found.");
        }
    }
}
