// https://leetcode.com/problems/sliding-window-maximum/
//without deque
//without TLE
class leetcode_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            max = Math.max(max, nums[i]);
        }
        res[0] = max;
        for(int i = 1; i < n-k+1; i++){
            if(nums[i-1] == max){
                max = Integer.MIN_VALUE;
                for(int j = i; j < i+k; j++){
                    max = Math.max(max, nums[j]);
                }
            }else{
                max = Math.max(max, nums[i+k-1]);
            }
            res[i] = max;
        }
        return res;
    }
}