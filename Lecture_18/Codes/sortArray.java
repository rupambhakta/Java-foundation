import java.util.Scanner;

public class sortArray {
    static void swapInarray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }
    // static void sortZeroAnsOne(int arr[]) {
    // int n = arr.length;
    // int zero = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 0) {
    // zero++;
    // }
    // }
    // for (int i = 0; i < n; i++) {
    // if (i < zero) {
    // arr[i] = 0;
    // } else {
    // arr[i] = 1;
    // }
    // }
    // }

    static void sortZeroAnsOne(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapInarray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    static void soruByParity(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapInarray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    static int[] sortSqure(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans[] = new int[n];
        // int k = 0;
        int k = n-1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        // reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put value on array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("Sorted array: ");
        // sortZeroAnsOne(arr);
        // soruByParity(arr);
        int ans[] = sortSqure(arr);
        
        printArray(ans);
    }
}
