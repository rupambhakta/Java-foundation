import java.util.*;
public class secondSmallestSecondLargestElementinAArray {
    public static void main(String[] args) {
        int arr[] = { 8, 10, 5, 7, 9, 1 };
        Arrays.sort(arr);
        System.out.println("Second smallest element is " + arr[1]);
        System.out.println("Second largest element is " + arr[arr.length - 2]);
    }
}
