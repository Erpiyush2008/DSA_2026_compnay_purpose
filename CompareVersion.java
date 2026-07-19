public class CompareVersion {

    /*
    Step 1 : Split both versions using "."

Step 2 : Compare each part one by one.

Step 3 : Convert every part into Integer.

Step 4 : If part1 > part2 → return 1

Step 5 : If part1 < part2 → return -1

Step 6 : If equal → compare next part.

Step 7 : If one version ends,
         remaining parts are considered 0.

Step 8 : If everything is equal → return 0. */

    public static int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int n = Math.max(v1.length, v2.length);

        for (int i = 0; i < n; i++) {

            int num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            if (num1 > num2)
                return 1;

            if (num1 < num2)
                return -1;
        }

        return 0;
    }

    public static void main(String[] args) {

        String version1 = "1.01";
        String version2 = "1.001";

        System.out.println(compareVersion(version1, version2));
    }
}