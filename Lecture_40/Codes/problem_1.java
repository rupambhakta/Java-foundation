// 3,0,2,0,41
// 3,2,41,0,0
public class problem_1 {
    static void putZeroAtEnd(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 5, 0, 42 };
        putZeroAtEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
