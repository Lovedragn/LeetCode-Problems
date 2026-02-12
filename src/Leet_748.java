import java.util.HashMap;
import java.util.Map;

public class Leet_748 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
       
        int licance_size = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if (Character.isAlphabetic(c)) {
                map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0) + 1);
                licance_size++;
            }
        }

        String result = "";
        for (String s : words) {
            if (s.length() < licance_size)
                continue;

            HashMap<Character, Integer> temp = new HashMap<>();
            for (char cc : s.toCharArray()) {
                temp.put(Character.toLowerCase(cc), temp.getOrDefault(Character.toLowerCase(cc), 0) + 1);
            }

            boolean trigger = true;
            for (Map.Entry<Character, Integer> mm : map.entrySet()) {
                char v = mm.getKey();
                if (temp.getOrDefault(v, 0) < mm.getValue()) {
                    trigger = false;
                    break;
                }
            }

            if (trigger) {
                if (result.equals("") || s.length() < result.length()) {
                    result = s; // ✅ keep shortest
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("s123s213t234 p", new String[] { "step", "steps", "stripe", "stepple" }));
    }
}
