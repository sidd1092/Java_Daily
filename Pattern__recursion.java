public class Pattern__recursion {
    public static void main(String[] args) {
        int n = 5;
        int i = n;
        int j = n;
        Print(i, j);
    }

    public static void Print(int i, int j) {
        if (i == 0)
            return;
        else {
            if (j == 0) {
                System.out.print("\n");
                j = i - 1;
                Print(i - 1, j);
            } else {
                System.out.print("*");
                Print(i, j - 1);
            }
        }
    }
}