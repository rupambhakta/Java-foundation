public class RadixSort {
    static int findMax(int arr[]) {
        // { 1, 4, 5, 2, 2, 5 }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void CountSort(int arr[], int place) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) {// Frequency array
            count[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }
        // Copy all element of output in array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radix_sort(int arr[]) {
        int max = findMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            CountSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 335, 105, 4, 78, 908, 54 };
        radix_sort(arr);
        display(arr);
    }
}
