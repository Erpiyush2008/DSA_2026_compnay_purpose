import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Step 1 : Create HashMap
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 2 : Traverse each string
        for (String str : strs) {

            // Step 3 : Convert string to character array
            char[] ch = str.toCharArray();

            // Step 4 : Sort characters
            Arrays.sort(ch);

            // Step 5 : Convert sorted characters back to string
            String key = new String(ch);

            // Step 6 : If key not present then create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Step 7 : Add original string into list
            map.get(key).add(str);
        }

        // Step 8 : Return all groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }
}