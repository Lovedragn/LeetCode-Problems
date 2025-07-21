import java.util.*;

public class leet_1957 {
    public static String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();

        // for (int i = 0; i < s.length(); i++) {
        // int len = res.length();
        // if (len > 2 && res.charAt(len - 1) == s.charAt(i) && res.charAt(len - 2) ==
        // s.charAt(i)) {

        // continue;

        // }

        // res.append(s.charAt(i));
        // }
        int count = 1;
        res.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }

    public static void main(String args[]) {
        System.out.println(makeFancyString("leeeetcoddde"));
    }
}
