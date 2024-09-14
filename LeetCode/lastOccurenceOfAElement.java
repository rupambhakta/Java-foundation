import java.util.*;
public class lastOccurenceOfAElement{
    public static void main(String args[]){
        int arr[]={1,2,2,5,3,4};
        //,5,6,3,7,9,8,0,8,5,6,4,4,7,8,4,3,5,7,8,9,0,1,2,4,5,6,7
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // System.out.println(findLastOccurence(arr,n));
        System.out.println(sortedOrNot(arr));
        
    }
    public static int findLastOccurence(int arr[] , int n){
        int last = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                last = i;
            }
        }
        return last;
    }
    public static boolean sortedOrNot(int arr[]){
        boolean ans = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                ans = false;
            }
        }
        return ans;
    }
}