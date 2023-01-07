import java.util.ArrayList;

import java.util.Scanner;

public class problem_5 {

    public static void main(String[] args) {

        Scanner sYn = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");

        int n = sYn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < n; i++) {

            arr[i] = sYn.nextInt();

        }

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {

                al.add(arr[i]);

            }

        }

        if (al.size() == 0) {

            System.out.println("NA");

            return;

        }

        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");

        }

    }

}