

public class o1knapsack {

    static int knapsack(int[] wt, int[] val, int capacity, int n) {

        // Base Condition
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // If current item's weight is less than or equal to capacity
        if (wt[n - 1] <= capacity) {

            // Two choices:
            // 1. Take the item
            // 2. Don't take the item

            int take = val[n - 1]
                    + knapsack(wt, val, capacity - wt[n - 1], n - 1);

            int notTake = knapsack(wt, val, capacity, n - 1);

            return Math.max(take, notTake);
        }

        // If item cannot be taken
        else {
            return knapsack(wt, val, capacity, n - 1);
        }
    }

        static int[][] dp = new int[1002][1002];

    static int Memorization_knapsack(int[] wt, int[] val, int capacity, int n) {

        // Base condition
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // Already calculated
        if (dp[n][capacity] != -1) {
            return dp[n][capacity];
        }

        // If item can be taken
        if (wt[n - 1] <= capacity) {

            int take = val[n - 1]
                    + knapsack(wt, val,
                               capacity - wt[n - 1],
                               n - 1);

            int notTake = knapsack(wt, val,
                                   capacity,
                                   n - 1);

            dp[n][capacity] = Math.max(take, notTake);
        }

        // If item cannot be taken
        else {
            dp[n][capacity] = knapsack(wt, val,
                                       capacity,
                                       n - 1);
        }

        return dp[n][capacity];
    }


    public static void main(String[] args) {

        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};

        int capacity = 7;

        int n = wt.length;

        int maxProfit = knapsack(wt, val, capacity, n);

        System.out.println("Maximum Profit = " + maxProfit);
    }
}