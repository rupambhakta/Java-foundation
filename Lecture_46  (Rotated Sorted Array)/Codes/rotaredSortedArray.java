public class rotaredSortedArray {
    static int search(int arr[], int terget) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == terget) {
                return mid;
            } else if (arr[mid] <= arr[end]) { // Mid to end sorted
                if (terget > arr[mid] && terget <= end) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { // Start to mid sorted
                if (terget >= arr[mid] && terget < arr[mid]) {
                    end = mid - 1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        int terget = 4;
        System.out.println(search(arr, terget));
    }
}
