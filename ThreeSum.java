import java.util.*;

public class ThreeSum {
    /*
    Step 1 : Sort the array.

↓

Step 2 : Fix one element (i).

↓

Step 3 : Remaining array par
         Two Pointer lagao.

↓

left = i+1

right = n-1

↓

Step 4 :

sum = nums[i] + nums[left] + nums[right]

↓

sum == 0

Store Answer

left++

right--

↓

sum < 0

left++

↓

sum > 0

right-- */

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                }

                else if (sum < 0) {

                    left++;

                }

                else {

                    right--;

                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
}