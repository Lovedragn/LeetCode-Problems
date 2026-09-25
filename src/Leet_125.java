
public class Leet_125 {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            char l_char = s.charAt(l);
            char r_char = s.charAt(r);

            if (my_fun(l_char)) {
                if (my_fun(r_char)) {
                    if (l_char != r_char) {
                        return false;
                    }
                    r--;
                    l++;
                } else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return true;
    }

    public static boolean my_fun(char c) {
        return Character.isLetterOrDigit(c);
    }

    public static void main(String[] args) {
        String s = "S  uji ijus";
        System.out.println(isPalindrome(s));
    }
}
