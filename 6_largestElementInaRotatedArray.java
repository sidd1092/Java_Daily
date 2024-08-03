class largestElementInaRotatedArray {
   public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2};
    int start = 0;
    int end = arr.length - 1;  
    while(start<end)
    {
        int mid = start + (end - start) / 2;
        if(ar[mid])