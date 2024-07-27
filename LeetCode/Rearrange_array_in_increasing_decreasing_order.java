import java.util.Arrays;

public class Rearrange_array_in_increasing_decreasing_order {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 6, 15, 5, 9, 20 };
        Arrays.sort(arr);
        int start = arr.length / 2;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
