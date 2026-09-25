
import java.util.*;

public class Leet_2325 {

    public static String decodeMessage(String key, String message) {
        StringBuilder res = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        char start = 'a';

        for (char elem : key.replaceAll(" ","").toCharArray()) {
            if (elem != ' ' && !map.containsKey(elem)) {
                map.put(elem, start++);
            }
        }//0=>t

        for (char elem : message.toCharArray()) {
            if (elem == ' ') {
                res.append(' ');
            } else {
                res.append(map.get(elem));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }
}
