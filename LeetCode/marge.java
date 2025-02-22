import java.util.Arrays;

public class marge {
    public static void mergeTowArray(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0; j < n; j++) {
            nums1[m] = nums2[j];
            m++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3, 5 };
        int m = 0;
        int nums2[] = { 1 };
        int n = 1;
        mergeTowArray(nums1, m, nums2, n);
    }
}
