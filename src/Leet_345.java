import java.util.*;

public class Leet_345 {
    public static String reverseVowels(String s) {
        if (s.length() == 1)
            return s;
        StringBuilder res = new StringBuilder(s);
        int l = 0;
        int r = res.length() - 1;
        Set<Character> stack = Set.of('a','e','i','o','u','A','E','I','O','U');

        while (l < r) {
            char lc = res.charAt(l);
            char rc = res.charAt(r);

            if (stack.contains(lc)) {
                if (stack.contains(rc)) {
                    res.replace(l, l + 1, Character.toString(rc));
                    res.replace(r, r + 1, Character.toString(lc));
                    r--;
                    l++;
                } else {
                    r--;
                }
            } else {
                l++;
            }
        }
        return res.toString();
    }

    public static void main(String args[]) {
        String str = "IcecreAm";
        System.out.println(reverseVowels(str));
    }
}
