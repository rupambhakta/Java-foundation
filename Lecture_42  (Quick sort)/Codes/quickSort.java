import java.util.Random;

public class quickSort {
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int st, int end) {
        Random rand = new Random(); // Generating random number
        int n = rand.nextInt(arr.length);
        // System.out.println(n);
        int pivot = arr[n];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = st + count;
        swap(arr, st, pivotIndex);
        int i = st, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quick_sort(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }
        int pi = partition(arr, st, end);
        quick_sort(arr, st, pi - 1);
        quick_sort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 4, 6 };
        System.out.println("Array before sorting: ");
        display(arr);
        System.out.println();

        quick_sort(arr, 0, arr.length - 1);

        System.out.println("Array after sorting ");
        display(arr);
    }
}
