import java.util.Arrays;
import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how mant trans will arrive and departure today: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int dep[] = new int[n];

        System.out.println("Enter the time of arrival of those train: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the arrival time of " + (i + 1) + " no train: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the departure time of " + (i + 1) + " no train: ");
            dep[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformNeeded = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformNeeded++;
                i++;
            } else if (arr[i] > dep[j]) {
                platformNeeded--;
                j++;
            }
            if (platformNeeded > result) {
                result = platformNeeded;
            }
        }
        System.out.println("So we needed " + (result) + " platform.");
    }
}
