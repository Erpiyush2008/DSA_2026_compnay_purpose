

public class count_subset_sum {

    static int countSubsets(int[] arr, int sum) {

        int n = arr.length;

        // DP table
        int[][] dp = new int[n + 1][sum + 1];

        // Initialization
        // Sum = 0 -> empty subset is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // 0 elements and positive sum -> 0 subsets
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        // DP
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] <= j) {

                    // Exclude + Include
                    dp[i][j] =
                            dp[i - 1][j]
                            + dp[i - 1][j - arr[i - 1]];

                } else {

                    // Cannot include current element
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 8, 10};

        int sum = 10;

        int result = countSubsets(arr, sum);

        System.out.println("Number of subsets = " + result);
    }
}