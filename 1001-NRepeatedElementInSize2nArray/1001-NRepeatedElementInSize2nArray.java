// Last updated: 09/07/2026, 15:06:46
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                return num; // repeated element found
            }
        }
        return -1; // will never reach here
    }
}