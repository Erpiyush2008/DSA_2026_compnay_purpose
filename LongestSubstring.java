import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        int max = 0;

        while (right < s.length()) {

            if (!set.contains(s.charAt(right))) {

                set.add(s.charAt(right));

                max = Math.max(max, right - left + 1);

                right++;

            } else {

                set.remove(s.charAt(left));

                left++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}