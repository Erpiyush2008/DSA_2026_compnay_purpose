public class ValidPalindrome {

    /*
    Step 1 : Convert string to lowercase.

Step 2 : Take two pointers.
         start = 0
         end = n-1

Step 3 : Ignore non-alphanumeric characters.

Step 4 : Compare both characters.

Step 5 : If not equal → return false.

Step 6 : Move both pointers.

Step 7 : If loop finishes → return true. */
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}