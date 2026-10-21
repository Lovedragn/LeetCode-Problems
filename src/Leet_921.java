import java.util.Stack;

public class Leet_921 {
    public static int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (!stack.isEmpty()) {

                switch (c) {
                    case ')':
                        if (stack.peek() != c) {
                            stack.pop();
                            open--;
                        } else if (stack.peek() == c) {
                            close++;
                            stack.push(c);
                        }
                        break;

                    case '(':
                        open++;
                        stack.push(c);
                        break;
                }
            } else {
                stack.push(c);
                if (c == '(') {
                    open++;
                } else {
                    close++;
                }
            }
        }

        return Math.abs(open + close);

    }

    public static void main(String[] args) {

        System.out.println(minAddToMakeValid("))()()("));
    }
}