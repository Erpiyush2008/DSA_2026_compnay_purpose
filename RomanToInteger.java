/*
1. Har Roman character ki value nikalo.
2. Current aur Next compare karo.
3. Current < Next → Minus (-)
4. Current >= Next → Plus (+)
5. Last character hamesha Add (+) */
public class RomanToInteger {

    // Roman Character ki Value
    public static int value(char ch) {

        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;

        return 0;
    }

    // Roman to Integer Function
    public static int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            // Current < Next → Subtract
            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                sum -= current;
            }
            // Otherwise Add
            else {
                sum += current;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";

        System.out.println("Roman Number : " + s);
        System.out.println("Integer Value : " + romanToInt(s));

    }
}