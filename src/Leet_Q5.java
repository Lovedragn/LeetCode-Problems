import java.util.*;

class Leet_Q5 {
    public static long appealSum(String s) {
        int[] last = new int[26]; // track last seen positions for a-z
        Arrays.fill(last, -1);
        
        long res = 0;
        long curr = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            System.out.println("hh " + ch);
            curr += i - last[ch];
            res += curr;//0 
            last[ch] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "a"; // Example
        System.out.println(appealSum(s)); // Output: 10
    }
}
