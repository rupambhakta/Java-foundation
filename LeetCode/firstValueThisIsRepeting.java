import java.util.*;
public class firstValueThisIsRepeting{
    public static void main(String args[]){
        int arr[] = {3,4,5,2,6,1,1,7,8,6};
        System.out.println(findRepitation(arr));
        // System.out.println(findRepitationInLinearTime(arr));
        // System.out.println(firstRepitation(arr));
    }
    public static int findRepitation(int arr[]){
        int n = arr.length;
        int count = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    
    // public static int findRepitationInLinearTime(int arr[]){
    //     int n = arr.length;
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i : arr){
    //         if(!set.add(arr[i])){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // public static int firstRepitation(int arr[]) {
    //     java.util.LinkedHashMap<Integer, Integer> map = new java.util.LinkedHashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if (map.containsKey(arr[i])) {
    //             return arr[i];
    //         } else {
    //             map.put(arr[i], i);
    //         }
    //     }
    //     return -1;
    // }

}