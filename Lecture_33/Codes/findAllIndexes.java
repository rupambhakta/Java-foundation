import java.util.ArrayList;

public class findAllIndexes {

    static ArrayList<Integer> allIndexes(int arr[], int n, int terget, int idx) {
        if (idx >= n) {
            return new ArrayList<Integer>(); // It will return empty array list.
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == terget) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndexes(arr, n, terget, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 4, 3, 4, 5, 3, 2, 3, 4, 5, 4, 3, 3, 4, 5, 5, 4, 3, 3, 3, 4, 5, 5, 5, 4, 4, 3, 3, 3, 3,
                3, 3 };
        int terget = 3;
        int n = arr.length;
        ArrayList<Integer> ans = allIndexes(arr, n, terget, 0);
        for (Integer i : ans) {
            System.out.print(i+" ");
        }
    }
}
