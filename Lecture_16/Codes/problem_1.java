import java.util.Scanner;

public class problem_1 {
    static String exactly(int arr[], int x) {
        String ans = "No";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == x) {
                    ans = "Yes";
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of  the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put values in arrat: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "no element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println(exactly(arr, x));
    }
}
