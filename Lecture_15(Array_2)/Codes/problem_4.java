import java.util.Scanner;

public class problem_4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array: ");

        int n = scn.nextInt();

        int s = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();

        }

        int i = 0;

        int j = 0;

        int sum = 0;

        while (j < n) {

            sum += arr[j];

            if (sum > s) {

                while (sum > s && i < j) {

                    sum -= arr[i];

                    i++;

                }

            }

            if (sum == s) {

                System.out.print(i + " ");

                System.out.print(j);

                break;

            }

            j++;

        }

    }

}