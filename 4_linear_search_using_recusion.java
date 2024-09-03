/*package whatever //do not write package name here */

// import java.util.*;

class linear_search_using_recursion {
	public static void main (String[] args) {
	    int[] arr = {1,2,3,456,67,49,84,31,8,3,18,3,16};
		System.out.println("found at index = "+find(arr,1,18));
		
	}
	static int find(int[] arr,int i,int target){
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        return find(arr,i+1,target);
    }
}