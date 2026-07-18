public class StringToInteger {

    public static int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        long num = 0;

        // Step 1 : Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // If string is empty
        if (i == s.length()) {
            return 0;
        }

        // Step 2 : Check sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 3 : Read digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Step 4 : Build number
            num = num * 10 + digit;

            // Step 5 : Overflow Check
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        // Step 6 : Return Answer
        return (int) (sign * num);
    }

    public static void main(String[] args) {

        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words 987"));
        System.out.println(myAtoi("-91283472332"));

    }
}