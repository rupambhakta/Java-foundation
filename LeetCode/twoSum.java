import java.util.*;
public class twoSum{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,4};
        for(int i:calculateTwoSum(arr,4)){
            System.out.print(i+" ");
        };
    }
    public static int[] calculateTwoSum(int arr[],int target){
        int newArr[] = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[] = {-1};
        for(int i=0;i<arr.length;i++){
            int partner = target-arr[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
            }else{
                mp.put(arr[i],i);
            }
        }
        return ans;
    }
}