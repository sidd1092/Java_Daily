public class Main {
    public static void main(String[] args) {
        String str = "a1a2a3a4a5a6a87a9aa98aa2";
        System.out.println(removeA(str));
    }

    public static String removeA(String in){
        if(in.isEmpty())
        {
            return "";
        }
        else
        {
            if(in.charAt(0) == 'a')
            {
                return removeA(in.substring(1));
            }
            else
            {
                return in.charAt(0) + removeA(in.substring(1));
            }
        }
    }
}