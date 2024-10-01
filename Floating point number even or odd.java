//https://www.geeksforgeeks.org/problems/floating-point-number-even-or-odd0146/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

class Solution 
{ 
    boolean isEven(String s,int n) 
    { 
        // code here
        int i = 0;
        while(s.charAt(i) != '.'){
            i++;
        }
        if(s.charAt(i+1) == '0' || s.charAt(i+1) == '2' || s.charAt(i+1) == '4' || s.charAt(i+1) == '6' || s.charAt(i+1) == '8'){
            return true;
        }
        return false;
    }
}