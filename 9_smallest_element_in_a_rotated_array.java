class smallest_element_in_a_rotated_array{
    public static void main(String[] args) {
        int arr[] ={8,9,10,11,1,2,3,4,5,6,7};
        int n = arr.length;
        int start =0,end = n-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[end])
                start=mid+1;
            else
                end=mid;
        }
        System.out.println(arr[start]);
    }
}