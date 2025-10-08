import java.util.*;

public class Leet_241 {

    public static List<Integer> diffWaysToCompute(String expression) {
        return backtrack(expression, 0, expression.length() - 1);
    }

    public static List<Integer> backtrack(String expression, int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            char c = expression.charAt(i);
            if (!Character.isDigit(c)) {
                // Split and solve left and right parts
                List<Integer> num1 = backtrack(expression, left, i - 1);
                List<Integer> num2 = backtrack(expression, i + 1, right);

                for (int a : num1) {
                    for (int b : num2) {
                        res.add(calculate(c, a, b));
                    }
                }
            }
        }

        // Base case: If no operator was found, it's a number
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression.substring(left, right + 1)));
        }

        return res;
    }

    public static int calculate(char operator, int first, int second) {
        switch (operator) {
            case '-': return first - second;
            case '+': return first + second;
            case '*': return first * second;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        String str = "2-1-1";
        System.out.println(diffWaysToCompute(str)); // [0, 2]
    }
}
