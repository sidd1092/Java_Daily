final int MOD = 1000000007;
        long minCost = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long cost = Math.abs(A.get(i) - B.get(i));
            minCost = Math.min(minCost, cost);
        }
        return (int) (minCost % MOD);