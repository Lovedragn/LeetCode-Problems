import java.util.*;

public class Leet_557 {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] spliter = s.split(" ");

        for (int i = 0; i < spliter.length; i++) {
            String ss = spliter[i];
            char[] word = ss.toCharArray();
            int l = 0;
            int r = word.length - 1;
            while (l < r) {
                char temp = word[l];
                word[l] = word[r];
                word[r] = temp;
                l++;
                r--;

            }
            res.append(word);
            if (i != spliter.length-1) {
                res.append(" ");
            }
        }

        return res.toString();
    }

    public static void main(String args[]) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}