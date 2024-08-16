public class two_sumFirstApproach {

    public int[] twoSum(int nums[], int target) {
        int n = nums.length;
        int ans[] = { -1 };
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; i++) {
                if (nums[j] == target - nums[i]) {
                    ans = new int[]{i,j};
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
