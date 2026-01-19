import java.util.HashMap;
import java.util.Map;

public class Leet_409 {
    public static int longestPalindrome(String s) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        boolean trigger = true;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            int value = i.getValue();
            if (value % 2 == 0 ) {
                 
                res += value;
            } else if( trigger){
                trigger = false;
                res+=value;
            }else {
                res += (value-1);
            }
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
