
import java.util.*;

public class Leet_392 {

    public static boolean isSubsequence(String s, String t) {

        int slen = s.length() - 1; // abc
        int tlen = 0; //advbt.fc
        Stack<Character> stack = new Stack<>();

        while (tlen <= t.length() - 1) {
            stack.push(t.charAt(tlen));
            tlen++;
        }
        while (slen >= 0 && !(stack.isEmpty())) {
            if (stack.peek().equals(s.charAt(slen))) {
                slen--;
            }
            stack.pop();
        }
        System.out.println(slen);

        return slen == -1;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
}
