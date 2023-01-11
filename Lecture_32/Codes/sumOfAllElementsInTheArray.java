import java.util.Scanner;

public class sumOfAllElementsInTheArray {
    static int sumArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        return arr[idx] + sumArray(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter the " + (i + 1) + " no elements: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("the sum of all the elements of teh array is: " + sumArray(arr2, 0));
    }
}
