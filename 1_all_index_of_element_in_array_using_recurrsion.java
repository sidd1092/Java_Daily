import java.util.*;
class all_index_of_element_in_array_using_recurrsion{
    public static void main(String[] args) {
        int[] arr = {1,10,3,1,10};
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