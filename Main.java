public class Main {
    public static void main(String[] args) {
        String str = "ahfbaiufbaliuhfodahalsaaaaaaaaaaakkdfjbkdjkbjaba";
        System.out.println(removeA(str,""));
    }

    public static String removeA(String in ,String out){
        if(in.length() == 0){
            return out;
        }
        if(in.charAt(0) == 'a'){
            return removeA(in.substring(1),out);
        }
        return removeA(in.substring(1),out+in.charAt(0));
    }
}