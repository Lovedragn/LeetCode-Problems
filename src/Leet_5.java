import java.util.Queue;

public class Leet_5 {
    public static String longestPalindrome(String s) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String temp = s.substring(i, j + 1);
                if (ispalindrome(temp)) {
                    if (res.length() < temp.length()) {
                        res.delete(0, res.length());
                        res.append(temp);
                    }
                }
            }
        }
        return res.toString();
    }

    public static boolean ispalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "babas";
        System.out.println(longestPalindrome(str));
    }
}
