class largestElementInaRotatedArray {
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    } 

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,88,99,100,1,2,3,4};
        int ind = findPivot(arr);
        if(ind == 0) {
            System.out.println(arr[arr.length - 1]);
        } else {
            System.out.println(arr[ind - 1]);
        }
    }
}