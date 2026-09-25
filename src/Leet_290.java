
import java.util.*;

public class Leet_290 {

    public static boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<>();
        String[] strarr = s.split(" ");
        if (pattern.length() != strarr.length) {
            return false;
        }
        for (int i=0;i< strarr.length ;i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (map.get(pattern.charAt(i)).equals(strarr[i])) {
                    continue;
                }else{
                    return false;
                }
            }else{
                map.put(pattern.charAt(i),strarr[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
