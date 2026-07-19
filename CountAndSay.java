public class CountAndSay {

    /*
    Take Previous String

↓

Count Same Digits

↓

Append

Count

+

Digit

↓

Repeat */
    public static String countAndSay(int n) {

        String result = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder sb = new StringBuilder();

            int count = 1;

            for (int j = 0; j < result.length(); j++) {

                if (j < result.length() - 1 &&
                        result.charAt(j) == result.charAt(j + 1)) {

                    count++;

                } else {

                    sb.append(count);
                    sb.append(result.charAt(j));

                    count = 1;
                }
            }

            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(countAndSay(n));
    }
}