import java.util.*;

public class Codec {

    // Encode
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    // Decode
    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            j++;

            String word = s.substring(j, j + length);

            result.add(word);

            i = j + length;
        }

        return result;
    }

    public static void main(String[] args) {

        Codec obj = new Codec();

        List<String> list = Arrays.asList("Hello", "World");

        String encoded = obj.encode(list);

        System.out.println("Encoded : " + encoded);

        List<String> decoded = obj.decode(encoded);

        System.out.println("Decoded : " + decoded);
    }
}