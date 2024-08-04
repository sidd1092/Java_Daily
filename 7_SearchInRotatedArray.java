import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
    static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }        
        int pivot = s;
        int ind1 = Arrays.binarySearch(nums, 0, pivot, target);
        int ind2 = Arrays.binarySearch(nums, pivot, nums.length, target);
        if (ind1 >= 0) return ind1;
        if (ind2 >= 0) return ind2;        
        return -1;
    }
}