public class Pattern__recursion {
    public static void main(String[] args) {
        int n = 5;
        int i = n;
        int j = 1;
        Print(i, j);
    }

    public static void Print(int i, int j) {
        if (i == 0)
            return;
        else {
            if (j == i+1) {
                System.out.print("\n");
                Print(i - 1, 1);
            } else {
                System.out.print("*");
                Print(i, j + 1);
            }
        }
    }
}