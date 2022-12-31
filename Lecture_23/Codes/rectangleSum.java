import java.util.Scanner;

public class rectangleSum {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findSum(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static void prifixSumMatrix(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    // This method gives us Row-Wise and Coloum-Eise frifix sum
    static void prifixSumMatrix_2(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;
        // Traverse horaizentally to calculate row-wise prifix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        // Traverse vertically to calculate coloum-wise prifix sum
        for (int j = 0; j < c; j++) { // Fixing coloum
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    static int findSum2(int arr[][], int l1, int r1, int l2, int r2) {
        int sum = 0;
        prifixSumMatrix(arr);
        for (int i = l1; i <= l2; i++) {
            if (r1 > 1)
                sum += arr[i][r2] - arr[i][r1 - 1];
            else
                sum += arr[i][r2];
        }
        return sum;
    }

    static int findSum3(int arr[][], int l1, int r1, int l2, int r2) {
        int ans = 0;
        int sum = 0, up = 0, left = 0, leftup = 0;
        prifixSumMatrix_2(arr);
        sum = arr[l2][r2];
        if (l1 >= 1)
            up = arr[l1 - 1][r2];
        if (r1 >= 1)
            left = arr[l2][r1 - 1];
        if (l1 >= 1 && r1 >= 1)
            leftup = arr[l1 - 1][r1 - 1];
        ans = sum - up - left + leftup;
        return ans;
    }

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
        printArray(arr);
        System.out.println("Enter rectangle boundry l1,r1 & l2,r2: ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("rectrangle sum is: " + findSum(arr, l1, r1, l2, r2));
        System.out.println("rectrangle sum is: " + findSum2(arr, l1, r1, l2, r2));
        System.out.println("rectrangle sum is: " + findSum3(arr, l1, r1, l2, r2));
    }
}
