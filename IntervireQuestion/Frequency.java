import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5 };
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0)+1);
        }
        System.out.println(mp);
    }
}
