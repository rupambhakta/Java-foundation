import java.util.Arrays;

public class largestElementInaArray {
    public static void main(String[] args) {
        int arr[] = { 8, 10, 5, 7, 9, 1 };
        Arrays.sort(arr);
        System.out.println("largest element is " + arr[arr.length - 1]);
    }
}
