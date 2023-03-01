public class binarySearch {
    static boolean BinarySearch(int arr[], int terget) {
        int n = arr.length;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (terget == arr[mid]) {
                return true;
            } else if (terget < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    static boolean resBinarySearch(int arr[], int st, int end, int terget) {
        if (st > end)
            return false;
        int mid = (st + end) / 2;
        if (terget == arr[mid]) {
            return true;
        } else if (terget < arr[mid]) {
            return resBinarySearch(arr, st, end = mid - 1, terget);
        } else {
            return resBinarySearch(arr, st = mid + 1, end, terget);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int terget = 4;
        System.out.println(BinarySearch(arr, terget));
        System.out.println(resBinarySearch(arr, 0, arr.length - 1, terget));
    }
}