public class asg_4 {
    static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 8, 9, 11, 24, 43, 6 };
        int n = arr.length;
        System.out.println(n);
        InsertionSort(arr);
        System.out.println("The required element are: ");

        for (int i = n / 2; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
