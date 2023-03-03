//Find minimum in Rotating array
public class findMinimum {
    static int FindMin(int arr[]) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > arr[n - 1]) {
                st = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 9,10, 1, 2, 3, 4, 5 };
        int n = arr.length;
        System.out.println(FindMin(arr));
        
    }
}