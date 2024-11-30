// Solution for The String Puzzle TCS CODEVITA 
import java.util.*;

public class CODEVITA_TheStringPuzzle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        System.out.println(minCost(s, l));
        sc.close();
    }

    private static int minCost(String s, List<Integer> l) {
        int cost = 0;
        char prevChar = s.charAt(0);
        int prevL = l.get(0);
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == prevChar) {
                cost += Math.min(prevL, l.get(i));
                prevL = Math.max(prevL, l.get(i));
            } else {
                prevChar = currChar;
                prevL = l.get(i);
            }
        }
        return cost;
    }
}