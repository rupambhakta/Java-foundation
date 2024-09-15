import java.util.*;
public class find_a_unique_element{
    public static void main(String args[]){
        int arr[] = {1,2,1,5,3,6,5,6,2,0,3};
        System.out.println(findUnique(arr));        
    }
    public static int findUnique(int arr[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Return the key which has a value of 1
            }
        }
        
        return -1;
    }
}