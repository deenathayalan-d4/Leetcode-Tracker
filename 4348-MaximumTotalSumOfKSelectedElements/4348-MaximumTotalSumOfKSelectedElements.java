// Last updated: 09/07/2026, 15:05:26
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long t=0;
        for(int i=0;i<k;i++){
            long cn=nums[n-1-i];
            long cm=mul-i;
            long con=Math.max(cn*cm,cn);
            t+=con;
        }
        return t;
    }
}