public class sun_of_all_the_element_in_a_array {
    public static void calculateAVG(int arr[]) {
        int n = arr.length;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        float avg = sum / n;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        calculateAVG(arr);
    }
}
