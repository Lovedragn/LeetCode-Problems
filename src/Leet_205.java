
import java.util.*;

public class Leet_205 {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            char chars2 = t.charAt(i);
            if (!map.containsValue(chars)) {//r:b a:a b:r
                map.put(chars2, chars);
            }
        }
        String news = "";

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                news += map.get(t.charAt(i));
            }
        }
        return news.equals(s);
    }

    public static void main(String args[]) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
