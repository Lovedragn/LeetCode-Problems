
import java.util.*;

public class Leet_3 {

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int result = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            
            if (set.contains(c)) {
                set.remove(s.charAt(l));
               
                l++;
                result--;
            } else {
                set.add(c);
                r++;
                result++;
            }
            max = Math.max(result, max);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew"; // 3
        System.out.println(lengthOfLongestSubstring(s));

    }
}
