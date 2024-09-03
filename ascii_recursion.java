public class ascii_recursion {
    public static void main(String[] args) {
        ascii("ABC");
    }
    public static void ascii(String input){
        if(input.isEmpty()){
            System.out.println(input);
            return;
        }
        char ch = input.charAt(0);
        int ascii = ch;
        ascii(input.substring(1));
        System.out.println(ch);
        System.out.println(ascii);
    }

}
