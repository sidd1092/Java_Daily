import java.util.Scanner;
public class CODEVITA_ZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.print(l);
        } else if (k == l) {
            System.out.print(0);
        } else {
            int zeros = l - k;
            int blocks = k + 1;
            int min = zeros / blocks;
            int extraZeros = zeros % blocks;
            if (extraZeros > 0) {
                System.out.print(min + 1);
            } else {
                System.out.print(min);
            }
        }
        sc.close();
    }
}