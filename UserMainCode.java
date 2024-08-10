public class UserMainCode {
    public int passTheBall(int input1, int input2, int input3) {
        return dfs(input1, input2, input2, input3);
    }

    private int dfs(int n, int start, int current, int movesLeft) {
        if (movesLeft == 0) {
            return current == start ? 1 : 0;
        }

        int ways = 0;
        for (int i = 1; i <= n; i++) {
            if (i != current && (current % i == 0 || i % current == 0)) {
                ways += dfs(n, start, i, movesLeft - 1);
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        UserMainCode umc = new UserMainCode();
        System.out.println(umc.passTheBall(3, 2, 2)); // Output: 1
        System.out.println(umc.passTheBall(3, 2, 4)); // Output: 3
    }
}