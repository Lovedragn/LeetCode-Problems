
import java.util.*;

public class Leet_387 {

    public static int firstUniqChar(String s) {
        int res = -1;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        for (int i = 0; i < s.length(); i++) { 
            if (map.get(s.charAt(i)).equals(1)) {
                res = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "LeeL";
        System.out.println(firstUniqChar(str));
    }
}
