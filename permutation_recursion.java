public class permutation_recursion {
    public static void main(String[] args) {
        String str = "abc";
        permute(str,"");
    }
    static void permute (String input, String output)
    {
        if(input.isEmpty()){
            System.err.println(output);
            return;

        }
        char ch = input.charAt(0);
        for(int i = 0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i);
            permute(input.substring(1),first+ch+second);
        }
    }
}