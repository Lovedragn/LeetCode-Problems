import java.util.Queue;

public class Leet_5 {
    public static String longestPalindrome(String s) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String even = ispalindrome(s, i, i);
            String odd = ispalindrome(s, i, i + 1);

            if (res.length() < even.length() ) {
                res.delete(0, res.length());
                res.append(even);
            } else if (res.length() < odd.length()) {
                res.delete(0, res.length());
                res.append(odd);

            }

        }
        return res.toString();
    }

    public static String ispalindrome(String s, int l, int r) {
        while (l <= r  && r < s.length() && s.charAt(l) != s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }

    public static void main(String[] args) {
        String str = "bababasasasas";
        System.out.println(longestPalindrome(str));
    }
}
