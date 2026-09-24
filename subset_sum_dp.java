

public class subset_sum_dp {

    static boolean subsetSum(int[] arr, int sum) {

        int n = arr.length;

        // DP table
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= sum; j++) {

                // Sum = 0 is always possible
                if (j == 0) {
                    dp[i][j] = true;
                }

                // No elements and sum > 0
                else if (i == 0) {
                    dp[i][j] = false;
                }
            }
        }

        // DP calculation
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sum; j++) {

                // Current element can be included
                if (arr[i - 1] <= j) {

                    dp[i][j] =
                            dp[i - 1][j - arr[i - 1]]
                            || dp[i - 1][j];
                }

                // Current element cannot be included
                else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 10};

        int sum = 11;

        boolean result = subsetSum(arr, sum);

        System.out.println("Subset Sum exists: " + result);
    }
}