class leetcode410_using_binarySearch{
    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for(int num : nums){
            right += num;
            left = Math.max(left, num);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(canSplit(nums, m, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canSplit(int[] nums, int m, int target){
        int count = 1;
        int sum = 0;
        for(int num : nums){
            sum += num;
            if(sum > target){
                sum = num;
                count++;
                if(count > m){
                    return false;
                }
            }
        }
        return true;
    }
}