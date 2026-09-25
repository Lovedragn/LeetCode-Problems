
import java.util.*;


public class Leet_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        for (Character elem : magazine.toCharArray()) {
            map.put(elem, map.getOrDefault(elem, 0)+1);
        }
        int l = ransomNote.length()-1;
        while (l >=0) { 
            char c = ransomNote.charAt(l);
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c)-1);
            l--;
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aasb";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }

}
