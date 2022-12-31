import java.util.Scanner;

/*Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.
Input 1: 
N = 3
[1,3,5]
Expected Output:
4
 */
public class problem_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int odd = 0, even = 0, sum = 0;
        for (int num : arr) {
            if (num % 2 == 1) {
                int temp = odd; // swap odd and even
                odd = even;
                even = temp;
                odd++;
            } else {
                even++;
            }
            sum += odd;
        }
        System.out.println("The sum is " + sum);
    }
}