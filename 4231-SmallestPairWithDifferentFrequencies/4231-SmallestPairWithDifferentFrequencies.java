// Last updated: 09/07/2026, 15:05:36
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
       int[] frequency = new int[101];
        for(int i = 0; i<nums.length;i++){
            frequency[nums[i]]++;
        }
        for(int x = 1;x <= 100; x++){
            if(frequency[x] == 0) continue;
            for(int y = x + 1; y <= 100; y++){
                if(frequency[y] == 0) continue;
                if(frequency[x] != frequency[y]){
                    return new int[]{x,y};
                }
            }
        }
    return new int[]{-1, -1};
    }
}