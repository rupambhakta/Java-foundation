public class sum_all_the_element_in_a_array {
    public static void main(String[] args) {
        int arr[]= {1,2,3,8,9,1,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
