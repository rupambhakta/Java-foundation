import java.util.Arrays;

public class smallestElementInaArray {
    public static void main(String[] args) {
        int arr[] = { 8, 10, 5, 7, 9, 1 };
        Arrays.sort(arr);
        System.out.println("Smallest Element is " + arr[0]);
    }
}
