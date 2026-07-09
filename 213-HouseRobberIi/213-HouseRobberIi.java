// Last updated: 09/07/2026, 15:08:06
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
        }

        for (int i = 1; i < n; i++) {
            arr2[i - 1] = nums[i];
        }

        return Math.max(helper(arr1), helper(arr2));
    }

    public int helper(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}