import java.util.*;
public class Leet_3146 {

    public static int findPermutationDifference(String s, String t) {
        int res = 0;

        HashMap<Character, Integer> Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            Smap.put(s.charAt(i), i);
            Tmap.put(t.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            res += Math.abs(i - Tmap.get(start));
        }
        return res; 
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(findPermutationDifference(s, t));
    }
}
