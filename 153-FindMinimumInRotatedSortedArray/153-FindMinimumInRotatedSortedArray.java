// Last updated: 09/07/2026, 15:08:44
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int ans = Integer.MAX_VALUE;

        while (i <= j) {
            if (nums[i] <= nums[j]) {
                ans = Math.min(ans, nums[i]);
                break;
            }

            int mid = i + (j - i) / 2;
            if (nums[i] <= nums[mid]) {
                ans = Math.min(ans, nums[i]);
                i = mid + 1;
            }
            else {
                ans = Math.min(ans, nums[mid]);
                j = mid - 1;
            }
        }

        return ans;
    }
}