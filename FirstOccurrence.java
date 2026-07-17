public class FirstOccurrence {

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Last possible starting index
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // Entire needle matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}

/*
public class FirstOccurrence {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int ans = haystack.indexOf(needle);

        System.out.println(ans);
    }
} */