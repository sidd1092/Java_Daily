// import java.util.*;
// class Orchard {
//     public static int cal_P(String row) {
//         int count = 0;
//         int n = row.length();
//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 if (row.charAt(i) != row.charAt(j)) {
//                     for (int k = j + 1; k < n; k++) {
//                         if (row.charAt(j) != row.charAt(k)) {
//                             count++;
//                         }
//                     }
//                 }
//             }
//         }
//         return count;
//     }
//     public static boolean isValidInput(String row) {
//         return row.matches("[ML]+");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String ashokRow = scanner.nextLine();
//         String anandRow = scanner.nextLine();
//         if (!isValidInput(ashokRow) || !isValidInput(anandRow)) {
//             System.out.print("Invalid input");
//             return;
//         }
//         int ashok_P = cal_P(ashokRow);
//         int anand_P = cal_P(anandRow);
//         if (ashok_P > anand_P)
//             System.out.print("Ashok");
//         else if (anand_P > ashok_P)
//             System.out.print("Anand");
//         else
//             System.out.print("Draw");
//         scanner.close();
//     }
// }

//remove TLE
import java.util.*;
public class Orchard
{
    public static int cal_P(String row)
    {
        int count = 0;
        int n = row.length();
        for (int i = 0; i < n - 2; i++)
        {
            for (int j = i + 1; j < n - 1; j++)
            {
                if (row.charAt(i) != row.charAt(j))
                {
                    for (int k = j + 1; k < n; k++)
                    {
                        if (row.charAt(j) != row.charAt(k))
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static boolean isValidInput(String row)
    {
        return row.matches("[ML]+");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ashokRow = sc.nextLine();
        String anandRow = sc.nextLine();
        if (!isValidInput(ashokRow) || !isValidInput(anandRow))
        {
            System.out.print("Invalid input");
            return;
        }
        int ashok_P = cal_P(ashokRow);
        int anand_P = cal_P(anandRow);
        if (ashok_P > anand_P)
            System.out.print("Ashok");
        else if (anand_P > ashok_P)
            System.out.print("Anand");
        else
            System.out.print("Draw");
        sc.close();
    }
}
