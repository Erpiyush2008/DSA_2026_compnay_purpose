public class SubarraySum {

    public static int subarraySum(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int nums[] = {1,1,1};

        int k = 2;

        System.out.println(subarraySum(nums,k));
    }
}


/*

public class SubarraySum {

    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;

        // Prefix Sum Array
        int[] prefix = new int[n + 1];

        // Build Prefix Sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int count = 0;

        // Check every possible subarray
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {

                if (prefix[j] - prefix[i] == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int nums[] = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }
}
*/