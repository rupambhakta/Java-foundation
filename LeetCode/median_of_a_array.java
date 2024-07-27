import java.util.Arrays;

public class median_of_a_array {
    public static void median(int arr[]) {
        int n = arr.length;
        float k = n % 2;
        float median = 0;
        if (k == 0) {
            median = ((float) arr[n / 2] + (float) arr[(n / 2) - 1]) / 2;
        } else {
            median = arr[n / 2];
        }
        System.out.println("Median is " + median);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Arrays.sort(arr);
        median(arr);
    }
}
