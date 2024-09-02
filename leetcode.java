import java.util.*;
class Solution {
    public List<List<Integer>> func(int val) {
        val--;
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ls.add(1);
        ans.add(ls);
        if(val ==0)
            return ans;
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        temp1.add(1);
        ans.add(temp1);
        if(val ==1)
            return ans;
        for(int i = 2;i<=val;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j< ans.get(i-1).size()-1;j++)
            {
                temp.add(ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}