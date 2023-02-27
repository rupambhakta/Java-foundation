public class sort012 {
    static void display(int arr[]) {
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void Sort012(int arr[]) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        // Explore the unknown region
        while (mid <= hi) {
            if(arr[mid]==0){
                swap(arr, mid, lo);
                mid++;
                lo++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 0, 0, 1, 1, 2, 0, 1, 0 };
        Sort012(arr);
        display(arr);
    }
}
