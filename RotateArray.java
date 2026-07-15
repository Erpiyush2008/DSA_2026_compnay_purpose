import java.util.Arrays;

 public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            result[(i + k) % n] = nums[i];

        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7};

        

        rotate(nums,5);

        System.out.println(Arrays.toString(nums));
    }
}



// import java.util.Arrays;

// public class RotateArray {

    // public static void reverse(int[] nums, int start, int end) {

    //     while (start < end) {

    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;

    //         start++;
    //         end--;
    //     }
    // }

//     public static void rotate(int[] nums, int k) {

//         int n = nums.length;

//         k = k % n;

//         // Step 1
//         reverse(nums, 0, n - 1);

//         // Step 2
//         reverse(nums, 0, k - 1);

//         // Step 3
//         reverse(nums, k, n - 1);
//     }

//     public static void main(String[] args) {

//         int nums[] = {1,2,3,4,5,6,7};

//         int k = 3;

//         rotate(nums, k);

//         System.out.println(Arrays.toString(nums));
//     }
// }