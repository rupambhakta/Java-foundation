import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5 };
        Set<Integer> set = new HashSet<>();
        for(int n: arr){
            set.add(n);
        }
        System.out.println(set);
    }
}
