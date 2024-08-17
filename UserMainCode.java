class Solution {
    public int fun(String s) {
        int len = s.length();
        if(len==1)
            return 1;
        int start=0,end = 1;int max =0;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(end));
        while(end<len)
        {
            if(sb.indexOf(s.chartAt(end))>=0 ) 
            {
                max = Math.max(max,(end-start));
                start= s.indexOf( s.chartAt(end) , start+1 );
                sb.setLength(0);
            }
            else
            {
            end++;
            sb.append(s.charAt(end));
            }
        }
        max = Math.max(max,(end-start));
        return max;
    }
}  