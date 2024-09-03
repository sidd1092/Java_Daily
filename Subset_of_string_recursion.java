import java.util.*;
public class Subset_of_string_recursion {
    public static ArrayList<String> list = new ArrayList<>();    
    public static void main(String[] args) {
        list.clear();
        subset("","ABC");
        // Collections.sort(list);
        System.out.println(list);
    }
    public static void subset(String output, String input){
        if(input.isEmpty()){
            list.add(output);
            return;
        }
        char ch = input.charAt(0);
        // input = input.substring(1);
        subset(output+ch, input.substring(1));
        subset(output, input.substring(1));
    }
    
}
