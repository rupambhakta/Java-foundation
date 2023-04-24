import java.util.Arrays;

public class KthLargestElementinanArray_215 {
    static int findKth(int arr[],int k){
        Arrays.sort(arr);
        if(arr.length==0){
            return -1;
        }
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int arr[]={};
        int k=2;
        System.out.println(findKth(arr, k));
    }
}
