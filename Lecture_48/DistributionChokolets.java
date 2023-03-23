public class DistributionChokolets {

    static boolean isDivitionPossible(int a[], int m, int maxChocoletAllowed) {
        int numberOfStudent = 1;
        int choc = 0; // Number of chocolete current student has.
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxChocoletAllowed)
                return false;
            if (choc + a[i] <= maxChocoletAllowed) {
                choc += a[i];
            } else {
                numberOfStudent++;
                choc = a[i];
            }
        }
        // return numberOfStudent <= m;

        if (numberOfStudent > m) {
            return false;
        }
        return true;
    }

    static int distribute_chocolet(int a[], int m) {
        if (a.length < m)
            return -1;
        int ans = 0, st = 1, end = (int) 1e9;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isDivitionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 12, 34, 67, 90 };
        int m = 2;
        System.out.println(distribute_chocolet(a, m));
    }
}