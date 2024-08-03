import java.util.*;
class rotate_array_K_times{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        rotateArray(arr,k);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
    static void rotateArray(int[] arr,int k){
        k = k%arr.length;
        if(k<0)
            k = k+arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
