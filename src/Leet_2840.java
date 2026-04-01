import java.util.HashMap;

public class Leet_2840 {
    public static boolean checkStrings(String s1, String s2) {
        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            map.putIfAbsent(c, new int[2]);
            map.get(c)[i%2]++;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!map.containsKey(c) || map.get(c)[i % 2] <= 0){
                return false;
            }
            map.get(c)[i % 2]--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("abcdba", "dabdab"));
    }
}
