// Given a grid of size m * n, let us assume you are starting at (I , I) and your goal is to reach (m, n). At
// any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
// Now consider if some obstacles are added to the grids. How many unique paths would there be?
// An obstacle and space are marked as 1 and O respectively in the grid.
// use recursion to solve the problem.
import java.util.Scanner;

class tcs_ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        System.out.println("Enter the grid elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("The number of unique paths are: " + uniquePaths(grid));
        sc.close();
    }

    public static int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return uniquePaths(grid, m, n, 0, 0);
    }

    public static int uniquePaths(int[][] grid, int m, int n, int i, int j) {
        if (i >= m || j >= n || grid[i][j] == 1) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        return uniquePaths(grid, m, n, i + 1, j) + uniquePaths(grid, m, n, i, j + 1);
    }
}