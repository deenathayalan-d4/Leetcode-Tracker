// Last updated: 09/07/2026, 15:05:40
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int small =0;
        int large =0;
        int n= nums.length;
        for(int i=0;i<k;i++){
            small+=nums[i];
        }
        for(int i=n-1;i>=n-k;i--){
            large+=nums[i];
        }
        return Math.abs(large-small);
    }
}