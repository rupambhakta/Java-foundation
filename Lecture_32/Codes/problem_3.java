import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter thr lenght of the temporary array 'r': ");
        int r = scn.nextInt();
        printCombination(arr, n, r);
    }
    public static void printCombination(int[] arr, int n, int r) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];
        // Print all combination using temporary array 'data[]'
        combination(arr, n, r, 0, data, 0);
    }
    public static void combination(int[] arr, int n, int r, int index, int[] data, int i) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println("");
            return;
        }
        // When no more elements are there to put in data[]
        if (i >= n)
            return;
        // current is included, put next at next location
        data[index] = arr[i];
        combination(arr, n, r, index + 1, data, i + 1);
        // current is excluded, replace it with next (Note that i+1 is passed, but index is not changed)
        combination(arr, n, r, index, data, i + 1);
    }
}