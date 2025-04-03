
import java.util.*;

public class Leet_1021 {

    public static String removeOuterParentheses(String s) {
        StringBuilder output = new StringBuilder();
        int idx = 0;
        int counter = 0;
        Stack<Character> stack = new Stack<>();
        while (idx < s.length()) {
            StringBuilder res = new StringBuilder();
            if (s.charAt(idx) == '(') {
                counter++;
            }
            if (s.charAt(idx) == ')') {
                counter--;
            }
            stack.add(s.charAt(idx));
            if (counter == 0) {

                stack.pop();
                while (stack.size() >= 2) {
                    res.insert(0, stack.pop());
                }
                output.append(res);
                stack.pop();
            }
            idx++;
        }
        return output.toString();
    }

    public static void main(String args[]) {
        String str = "()()";
        System.out.println(removeOuterParentheses(str));
    }
}
