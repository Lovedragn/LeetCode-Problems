import java.util.Queue;

public class Leet_5 {
    public static String longestPalindrome(String s) {

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = ispalindrome(s, i, i);
            String even = ispalindrome(s, i, i + 1);

            if (res.length() < even.length() ) {
                res =even;
            } else if (res.length() < odd.length()) {
                res = odd;

            }

        }
        return res.toString();
    }

    public static String ispalindrome(String s, int l, int r) {
        while (l >= 0  && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l+1, r);
    }

    public static void main(String[] args) {
        String str = "bb";
        System.out.println(longestPalindrome(str));
    }
}
