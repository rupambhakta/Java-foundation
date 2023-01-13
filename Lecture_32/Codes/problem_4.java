import java.util.Scanner;

public class problem_4 {
        public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the length of  the 1st array array: ");
                int m = scn.nextInt();
                System.out.println("Enter the length of  the 2nd array array: ");
                int n = scn.nextInt();
                int[] A = new int[m];
                int[] B = new int[n];
                System.out.println("Enter the elements of first array: ");
                for (int i = 0; i < m; i++) {
                        A[i] = scn.nextInt();
                }
                System.out.println("Enter the elements of second array: ");
                for (int i = 0; i < n; i++) {
                        B[i] = scn.nextInt();
                }
                int[] C = new int[m + n];
                generate(A, B, C, 0, 0, m, n, 0, true);
        }

        public static void generate(int[] A, int[] B, int[] C, int i, int j, int m, int n, int len, boolean flag) {
                if (flag) {
                        // Include valid element from A
                        // Print output if there is at least one 'B' in output array 'C'
                        if (len != 0) {
                                printArr(C, len + 1);
                        }
                        // Recur for all elements of A after current index
                        for (int k = i; k < m; k++) {
                                if (len == 0) { // this block works for the very first call to include the first element
                                                // in the output array
                                        C[len] = A[k];
                                        // don't increment len as B is included
                                        generate(A, B, C, k + 1, j, m, n, len, !flag);
                                } else if (A[k] > C[len]) { // include valid element from A and recur
                                        C[len + 1] = A[k];
                                        generate(A, B, C, k + 1, j, m, n, len + 1, !flag);
                                }
                        }
                } else { // Include valid element from B and recur
                        for (int l = j; l < n; l++) {
                                if (B[l] > C[len]) {
                                        C[len + 1] = B[l];
                                        generate(A, B, C, i, l + 1, m, n, len + 1, !flag);
                                }
                        }
                }
        }
        public static void printArr(int[] arr, int n) {
                for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                System.out.println("");
        }
}