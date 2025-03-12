class max_consecutiveone3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int r = 0;
        int l = 0, max = 0, zero = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                zero=zero+1;
            }
            while (zero > k) {
                if (nums[l] == 0) {
                    zero=  zero-1;
                }
                l=l+1;
            }
            if(zero <= k) {
                max = Math.max(max, r - l + 1);
            }
            r=r+1;
        }
       System.out.println("Max Consecutive Ones: " + max);
    }
}


