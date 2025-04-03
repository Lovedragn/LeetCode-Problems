
import java.util.*;

public class Leet_1941 {

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int    i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (!map.isEmpty()) {
            int first = (int) map.get(s.charAt(0));
            for (Map.Entry<Character, Integer> elem : map.entrySet()) {
                if (elem.getValue() != first) {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abcbsca";
        System.out.println(areOccurrencesEqual(s));

    }
}
