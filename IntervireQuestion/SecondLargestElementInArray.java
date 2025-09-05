public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 35, 1 };
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Secodn Largest Element this this array is : "+second);
    }
}
