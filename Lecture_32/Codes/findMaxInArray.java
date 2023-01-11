import java.util.Scanner;

public class findMaxInArray {
    static int maxInArray(int arr[], int idx) {
        if (idx == arr.length-1) {
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
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
        System.out.println("The maximun element is: "+maxInArray(arr2, 0));
    }
}
