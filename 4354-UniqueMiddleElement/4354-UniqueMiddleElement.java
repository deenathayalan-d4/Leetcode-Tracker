// Last updated: 09/07/2026, 15:05:28
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int c=0;
        int middle = nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==middle){
                c++;
            }
        }
        return c==1;
    }
}