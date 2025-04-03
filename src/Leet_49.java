
import java.util.*;

public class Leet_49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String elem : strs) {
            char[] chararr = elem.toCharArray();
            Arrays.sort(chararr);
            String chararrs = new String(chararr);
            if (!map.containsKey(chararrs)) {
                map.put(chararrs, new ArrayList<>());
            }
            map.get(chararrs).add(elem);

        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
