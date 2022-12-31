
/*Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
integer)*/
import java.util.Arrays;
import java.util.Scanner;

public class problem_1 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put value on array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of m : ");
        int m = sc.nextInt();
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while (i < n) {
            count++;
            while (i < n - 1 && arr[i + 1] == arr[i]) {
                i++;
            }
            i++;
        }
        printArray(arr);
        System.out.println("Count is "+count);
        if (count >= m) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
