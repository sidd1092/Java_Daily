import java.util.*;
class Leetcode_17 {
    String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        solve(ans, "", digits, 0);
        return ans;
    }
    void solve(List<String> ans, String output, String digits, int index) {
        if (index >= digits.length()) {
            ans.add(output);
            return;
        }
        int number = Character.getNumericValue(digits.charAt(index));
        String value = mapping[number];
        for (char c : value.toCharArray())
            solve(ans, output + c, digits, index + 1);
    }
}