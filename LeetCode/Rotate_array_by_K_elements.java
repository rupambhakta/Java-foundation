public class Rotate_array_by_K_elements {
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array by k elements
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Normalize k
        System.out.println(k);
        // Step 1: Reverse the entire array
        reverseArray(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverseArray(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverseArray(arr, k, n - 1);
    }

    // Function to print the array
    private static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Original Array:");
        printArray(array);

        rotateArray(array, k);

        System.out.println("Array after rotation by " + k + " elements:");
        printArray(array);
    }
}
