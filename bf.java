class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            
            // Shrink window from left while sum >= target
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    
    // Test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(sol.minSubArrayLen(target, nums)); // Output: 2
    }
}