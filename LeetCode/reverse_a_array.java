public class reverse_a_array {
    public static void main(String[] args) {
        int arr[] = { 8, 10, 5, 7, 9, 1 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int left = 0;
        int end = arr.length - 1;
        while (left < end) {
            int temp = arr[left];
            arr[left]=arr[end];
            arr[end]=temp;
            left++;
            end--;
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
