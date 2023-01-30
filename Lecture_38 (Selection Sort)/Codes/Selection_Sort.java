public class Selection_Sort {
    static void selection_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indix = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_indix]) {
                    min_indix = j;
                }
            }
            // Swap current element and min element
            // Curr element = arr[i]
            // min element= arr[min_indix]
            int temp = arr[i];
            arr[i] = arr[min_indix];
            arr[min_indix] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 2 };
        selection_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Selection sort unstable
// Selection sort ia an inplace algorithm