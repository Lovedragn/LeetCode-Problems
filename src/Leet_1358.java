
import java.util.HashMap;

public class Leet_1358 {

    public static int numberOfSubstrings(String s) {
        int res = 0;
        HashMap<Character, Integer> set = new HashMap<>();
        set.put('a', 0);
        set.put('b', 0);
        set.put('c', 0);
        //hash set update

        int l = 0;
        int r = l;

        while (r < s.length()) {

            set.put(s.charAt(r), set.getOrDefault(s.charAt(r), 0) + 1);
            while (l < r) {
                if (set.get('a') > 0 && set.get('b') > 0 && set.get('c') > 0) {
                    int cal = s.length() - r;
                    res += cal;
                    set.put(s.charAt(l), set.getOrDefault(s.charAt(l), 0) - 1);
                    l++;
                }else{
                    break;
                }
            }
            r++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.err.println(numberOfSubstrings(s));
    }
}
