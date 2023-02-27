public class sortArray {
    static void sort_array(int arr[]) {
        int n = arr.length;
        int x = -1, y = -1;
        if (n <= 1) { // Corner cases
            return;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) { // First Conflict
                    x = i - 1;
                    y = i;
                } else { // Second Conflict
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int num[] = { 10, 5, 6, 7, 8, 9, 3 };
        sort_array(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}