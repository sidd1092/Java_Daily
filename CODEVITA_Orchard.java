import java.util.Scanner;
class CODEVITA_Orchard  
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String ashok_R = sc.nextLine();
        String anand_R = sc.nextLine();
        if (!isValid(ashok_R) || !isValid(anand_R)) 
        {
            System.out.print("Invalid input");
            sc.close();
            return;
        }
        int ashok_P = calposs(ashok_R);
        int anand_P = calposs(anand_R);
        if (ashok_P > anand_P)
            System.out.print("Ashok");
        else if (anand_P > ashok_P)
            System.out.print("Anand");
        else
            System.out.print("Draw");
        sc.close();
    }
    private static boolean isValid(String row) 
    {
        if (row.length() < 1 || row.length() > 100000)
            return false;
        for (char c : row.toCharArray())
            if (c != 'M' && c != 'L')
                return false;
        return true;
    }
    private static int calposs(String row) 
    {
        int count = 0;
        for (int i = 0; i < row.length() - 2; i++) 
            if (row.charAt(i) != row.charAt(i + 1)) 
                for (int j = i + 2; j < row.length(); j++)
                    if (row.charAt(j) != row.charAt(j - 1)) 
                        count++;
        return count;
    }
}