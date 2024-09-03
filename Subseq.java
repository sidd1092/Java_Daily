import java.util.*;
public class Subseq {
    public static ArrayList<String> list = new ArrayList<>();    
    public static void main(String[] args) {
        list.clear();
        subseq("","ABC");
        // Collections.sort(list);
        System.out.println(list);
    }
    public static void subseq(String output, String input){
        if(input.isEmpty()){
            list.add(output);
            return;
        }
        char ch = input.charAt(0);
        // input = input.substring(1);
        subseq(output+ch, input.substring(1));
        subseq(output, input.substring(1));
    }
    
}
