public class subsetSum {
    static void SubsetSum(int a[], int n, int idx, int currSum) {

        if (idx >= n) {
            System.out.print(currSum+" ");
            return;
        }

        SubsetSum(a, n, idx + 1, currSum + a[idx]);
        SubsetSum(a, n, idx + 1, currSum);
    }

    public static void main(String[] args) {
        int a[]={2,4,5};
        SubsetSum(a, a.length, 0, 0);
    }
}
