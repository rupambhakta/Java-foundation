import java.util.*;

public class Most_frequent_element_in_a_array {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 4, 1, 4, 4, 4 };
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }
        System.out.println(mp);
        System.out.println(Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey());

        // Finding max frequency of element in the Hashmap raw way
        int mxFreq = 0, ansKey = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() > mxFreq) {
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);

        // Another way
        for (var key : mp.keySet()) {
            if(mp.get(key)>mxFreq){
                mxFreq = mp.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey);
    }
}