public class reverseArray {
    // static void reverse(int arr[]) {
    // int n = arr.length;
    // int ans[] = new int[n];
    // int j = 0;
    // for (int i = n - 1; i >= 0; i--) {
    // ans[j++] = arr[i];
    // }
    // printArray(ans);
    // }
    static void swapInarray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int j = 0;
        int ans[] = new int[n];
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    // Rotate an array without using extra space
    static void rotateInplace(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0, n - k - 1);
        Reverse(arr, n - k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    static void Reverse(int arr[], int i, int j) {
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // reverse(arr);
        // printArray(arr);

        // System.out.println("Original array : ");
        // printArray(arr);
        // int ans[] = rotate(arr, 102);
        // System.out.println("After rotating: ");
        // printArray(ans);
        System.out.println("Original array : ");
        printArray(arr);
        rotateInplace(arr, 103);
        System.out.println("After rotating: ");
        printArray(arr);

    }
}
