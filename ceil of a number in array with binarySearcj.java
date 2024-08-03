class A {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,12,13,14,21,40};
        int num = 5;
        int result[] = ans(arr,num);
        System.out.println("Ceil of "+num+" is "+ result[0]);
        System.out.println("Floor of "+num+" is "+ result[1]);
    }
    static int[] ans(int[] arr , int num)
    {
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
        return new int[]{arr[low],arr[high]};
    }
}
