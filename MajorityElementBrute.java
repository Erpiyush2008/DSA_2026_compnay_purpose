public class MajorityElementBrute {

    public static int majorityElement(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
}

/*
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        System.out.println("Majority Element = " + majorityElement(nums));
    }
} */