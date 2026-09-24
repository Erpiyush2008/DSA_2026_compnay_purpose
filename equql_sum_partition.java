
import java.util.*;

public class equql_sum_partition {

    // Subset Sum using DP
    static boolean subsetSum(int[] arr, int sum) {

        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // Sum 0 is always possible
                if (j == 0) {
                    dp[i][j] = true;
                }

                // 0 elements cannot make positive sum
                else if (i == 0) {
                    dp[i][j] = false;
                }
            }
        }

        // DP
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] <= j) {

                    // Take OR Don't Take
                    dp[i][j] =
                            dp[i - 1][j - arr[i - 1]]
                            || dp[i - 1][j];

                } else {

                    // Cannot take current element
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    // Equal Sum Partition
    static boolean equalPartition(int[] arr) {

        int sum = 0;

        // Calculate total sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // If total sum is odd, partition is impossible
        if (sum % 2 != 0) {
            return false;
        }

        // Target sum for each subset
        int target = sum / 2;

        // Find subset with target sum
        return subsetSum(arr, target);
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 11, 5};

        boolean result = equalPartition(arr);

        System.out.println("Equal Sum Partition: " + result);
    }
}