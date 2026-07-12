public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Step 1: Find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find just greater element
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: Reverse remaining part
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}