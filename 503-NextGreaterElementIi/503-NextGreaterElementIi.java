// Last updated: 09/07/2026, 15:07:19
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < 2 * n; i++) {
            int currentIndex = i % n;
            
            while (!stack.isEmpty() && nums[stack.peek()] < nums[currentIndex]) {
                result[stack.pop()] = nums[currentIndex];
            }
            if (i < n) {
                stack.push(currentIndex);
            }
        }
        
        return result;
    }
}
 