public class ReverseWords {

    public static String reverseWords(String s) {

        // Remove leading & trailing spaces
        s = s.trim();

        // Split by one or more spaces
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        // Reverse order
        for (int i = words.length - 1; i >= 0; i--) {

            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "  hello   world  ";

        System.out.println(reverseWords(s));
    }
}