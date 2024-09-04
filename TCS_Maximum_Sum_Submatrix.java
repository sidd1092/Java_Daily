// Find Maximum Sum Submatrix in a given matrix
// Given a M x N matrix, calculate maximum sum submatrix of size k x k in a given M x N matrix in O(M*N) time. Here, 0 < k < M, N.

// For example, consider below 5 x 5 matrix

// [ 3 -4 6 -5 1 ]
// [ 1 -2 8 -4 -2 ]
// [ 3 -8 9 3 1 ]
// [ -7 3 4 2 7 ]
// [ -3 7 -5 7 -6 ]

// If k = 2, maximum sum k x k sub-matrix is

// [ 9 3 ]
// [ 4 2 ]

// If k = 3, maximum sum k x k sub-matrix is

// [ 8 -4 -2 ]
// [ 9 3 1 ]
// [ 4 2 7 ]

import java.util.*;
class Maximum_Sum_Submatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 3, -4, 6, -5, 1 }, { 1, -2, 8, -4, -2 }, { 3, -8, 9, 3, 1 }, { -7, 3, 4, 2, 7 },
                { -3, 7, -5, 7, -6 } };
        int k = 3;
        System.out.println("The maximum sum of submatrix is: " + maxSumSubmatrix(matrix, k));
    }

    public static int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = matrix[i - 1][j - 1] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = k; i <= m; i++) {
            for (int j = k; j <= n; j++) {
                int currentSum = sum[i][j] - sum[i - k][j] - sum[i][j - k] + sum[i - k][j - k];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}