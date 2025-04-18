class ceil_floor_of_a_number_in_array_with_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,12,13,14,21,40};
        int num =45;
        int result[] = ans(arr,num);
        System.out.println("Ceil of "+num+" is "+ result[0]);
        System.out.println("Floor of "+num+" is "+ result[1]);
    }
    static int[] ans(int[] arr , int num)
    {
        if(num < arr[0])
            return new int[]{arr[0],-1}; // Return -1 if no ceil found
        if(num > arr[arr.length-1])
            return new int[]{-1,arr[arr.length-1]}; // Return -1 if no floor found
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid] == num)
                return new int[]{arr[mid],arr[mid]};
            else if(arr[mid] < num)
                low = mid+1;
            else
                high = mid-1;
        }
        int ceil = arr[high];
        int floor = arr[low];
        return new int[]{ceil, floor};
    }
}