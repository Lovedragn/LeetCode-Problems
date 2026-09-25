
import java.util.HashMap;

public class Leet_1221 {

    public static int balancedStringSplit(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        map.put('L', 0);
        map.put('R', 0);

        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            int valueL = map.get('L');
            int valueR = map.get('R');

            // Check for balance between 'L' and 'R'
            if (valueL == valueR) {
                res++;
                map.put('L', 0);
                map.put('R', 0);
                r++;
                l = r; // Align pointers
            } else {
                r++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "RLRLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
    }
}
