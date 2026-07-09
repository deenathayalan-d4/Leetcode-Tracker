// Last updated: 09/07/2026, 15:06:27
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}