import java.util.Scanner;

public class problem_2 {
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
        System.out
                .println("Put values in firat matrix , Your matrix wiil be squre so enter same rou & coloum number:  ");
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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (i == j || i + j == r - 1) {
                    if (arr[i][j] == 0) {
                        System.out.println(false);
                        return;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        System.out.println(true);
    }
}
