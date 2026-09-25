
import java.util.*;

class Leet_13 {

    public static HashMap<Character, Integer> map = new HashMap<>();

    public static int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
     
        int idx = 0;
        int count = 0;

        while (idx < s.length()-1) {
           
            if (map.get(s.charAt(idx)) < map.get(s.charAt(idx+1))) {
                count -= map.get(s.charAt(idx));
            } else {
                count += map.get(s.charAt(idx));
            }
            idx++;

        }
        count += map.get(s.charAt(s.length()-1));
        return count;
    }

    public static void main(String args[]) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
