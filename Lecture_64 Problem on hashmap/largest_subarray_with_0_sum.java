import java.util.HashMap;

public class largest_subarray_with_0_sum {

    int zeroSumLargestSubarray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLength = 0, prefSum = 0;
        mp.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefSum +=arr[i];
            if(mp.containsKey(prefSum)){
                maxLength = Math.max(maxLength, i-mp.get(prefSum));
            }else{
                mp.put(prefSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

    }
}
