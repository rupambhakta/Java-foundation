public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int n = 7;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        System.out.println("The missing number is: " + (sum - actualSum));
    }
}
