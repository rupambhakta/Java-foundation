import java.util.Scanner;

import java.util.Arrays;

public class problem_3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array: ");

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();

        }

        int k = scn.nextInt();

        Arrays.sort(arr);

        System.out.print(arr[k - 1]);

    }

}
