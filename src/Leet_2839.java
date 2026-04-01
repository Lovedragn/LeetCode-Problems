import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leet_2839 {
    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd", "cadb"));
    }

    public static boolean canBeEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.putIfAbsent(c, new ArrayList<>());
            map.get(c).add(i % 2);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            List<Integer> temp = map.get(c);
            if (temp == null || !temp.remove((Integer) (i % 2))) {
                return false;
            }
        }
        return true;
    }

}
