import java.util.*;
class A{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        System.out.println(allIndex(arr, target, 0));
    }
    public static ArrayList<Integer> allIndex(int[] arr, int target, int index){
        if(index == arr.length){
            ArrayList<Integer> base = new ArrayList<>();
            return base;
        }
        ArrayList<Integer> recAns = allIndex(arr, target, index+1);
        if(arr[index] == target){
            recAns.add(index);
        }
        return recAns;
    }
}