// import java.util.Scanner;
// public class ZeroCount {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int l = sc.nextInt();
//         int k = sc.nextInt();
//         if (k == 0) {
//             System.out.println(l);
//         } else if (k == l) {
//             System.out.println(0);
//         } else {
//             int zeros = l - k;
//             int blocks = k + 1;
//             int min = zeros / blocks;
//             int extraZeros = zeros % blocks;
//             if (extraZeros > 0) {
//                 System.out.println(min + 1);
//             } else {
//                 System.out.println(min);
//             }
//         }
//     }
// }

//giving presentation error in tcs code vita
import java.util.Scanner;
public class ZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println(l);
        } else if (k == l) {
            System.out.println(0);
        } else {
            int zeros = l - k;
            int blocks = k + 1;
            int min = zeros / blocks;
            int extraZeros = zeros % blocks;
            if (extraZeros > 0) {
                System.out.println(min + 1);
            } else {
                System.out.println(min);
            }
        }
    }
}
// question: why is it givung presentation error in tcs code vita
// answer: the code is correct but the output is not matching with the expected output.
