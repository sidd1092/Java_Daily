public class all_Subarray_with_sum_K {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 10;
        System.out.println("The number of subarrays with sum " + k + " are: " + subarraySum(arr, k));
    }

    public static int subarraySum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
