/*package whatever //do not write package name here */

// import java.util.*;

class GFG {
	public static void main (String[] args) {
	    int[] arr = {1,2,3,456,67,49,84,31,8,3,18,3,16};
		System.out.println("found at index = "+find(arr,1,18));
		
	}
	static int find(int[] arr,int i,int x){
        if(i==arr.length)
            return -1;
        if(arr[i]==x)
            return i;
        return find(arr,i+1,x);
    }
}