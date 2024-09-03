import java.util.*;
public class Subseq {
    public static ArrayList<String> list = new ArrayList<>();    
    public static void main(String[] args) {
        list.clear();
        subseq("","ABC");
        Collections.sort(list);
        System.out.println(list);
    }
    public static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            list.add(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subseq(processed+ch, unprocessed);
        subseq(processed, unprocessed);
    }
    
}
