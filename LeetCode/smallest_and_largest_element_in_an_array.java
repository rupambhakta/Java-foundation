import java.util.Arrays;

public class smallest_and_largest_element_in_an_array{
    public static void main(String args[]){
        int arr[] = {1,4,6,2,7,3,4};
        for(int i : calculateSmallestAndLargest(arr)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : calculateKthSmallestAndLargest(arr,3)){
            System.out.print(i + " ");
        }
        
    }
    public static int[] calculateSmallestAndLargest(int[] arr){
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int newArr[] = new int[2];
        newArr[0] = arr[0];
        newArr[1] = arr[arr.length-1];
        return newArr;
    }
    public static int[] calculateKthSmallestAndLargest(int[] arr,int k){ // Array does not cointain any duplicate element
        Arrays.sort(arr);
        int newArr[] = new int[2];
        newArr[0] = arr[k-1];
        newArr[1] = arr[arr.length-k];
        return newArr;
    }
}