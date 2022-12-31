import java.util.Scanner;

public class problem_3 {

    static int missingElement(int arr[]) {
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ans) {
                // return ans;
                break;
            }
            ans++;
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
        System.out.println("The missing element is: "+missingElement(arr));
    }
}
