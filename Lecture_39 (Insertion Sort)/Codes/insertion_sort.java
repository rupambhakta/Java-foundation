public class insertion_sort {
    static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 8, 2, 7, 9, 1 };
        InsertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
// Time complexity in best case -> O(n)
// Time complexity in wrost case -> O(n^2)
// Space complexity -> O(1)
// Insertion sort is a stable algorithm.
// It is a inplace algorithm.