class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // If the current element is 0, increase the zero count.
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If zeroCount exceeds k, shrink the window from the left
            // until the window becomes valid (zeroCount <= k).
            while (zeroCount > k) {
                if (nums[left++] == 0) {
                    zeroCount--;
                }
            }
            
            // Update the maximum length.
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        // Pre-entered values for the array and k
        int[] nums = {1, 1, 0, 0, 1, 1, 0, 1, 1}; // Example input
        int k = 2; // Example input

        Solution solution = new Solution();
        int result = solution.longestOnes(nums, k);
        
        // Output the result
        System.out.println("The longest sequence of 1s we can get by flipping at most " + k + " zeros is: " + result);
    }
}
