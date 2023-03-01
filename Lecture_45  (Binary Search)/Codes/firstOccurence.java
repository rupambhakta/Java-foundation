public class firstOccurence {
    static int firstOcc(int arr[], int x) {
        int n = arr.length;
        int firstOccu = -1;
        int st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == x) {
                firstOccu = mid;
                end = mid - 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return firstOccu;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 5, 5, 5, 6, 6, 7, 7, 7, 8 };
        int x = 5;
        System.out.println(firstOcc(arr, x));
    }
}
