import java.util.Scanner;

public class question_35 {
    static int search(int nums[], int target) {
        int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1,  3 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }
}
