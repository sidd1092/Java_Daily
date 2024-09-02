class A11 {
    public int fun(String s) {
        int len = s.length();
        if (len == 1)
            return 1;
        int start = 0, end = 1;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(start));
        
        while (end < len) {
            System.out.println("Start: " + start + ", End: " + end + ", Max: " + max + ", SB: " + sb.toString());
            
            if (sb.indexOf(String.valueOf(s.charAt(end))) >= 0) {
                max = Math.max(max, (end - start));
                start = s.indexOf(s.charAt(end), start + 1);
                sb.setLength(0);
                sb.append(s.substring(start, end));
            } else {
                sb.append(s.charAt(end));
                end++;
            }
        }
        
        max = Math.max(max, (end - start));
        System.out.println("Final Max: " + max);
        return max;
    }
}