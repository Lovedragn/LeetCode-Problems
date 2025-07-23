import java.util.Stack;

public class Leet_682 {
    public static int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.equals("+")) {
                  int temp = stack.pop();
                int calc = temp + stack.peek();
                stack.push(temp);
                stack.push(calc);
                
            } else if (s.equals("D")) {
                int duplicate = stack.peek() * 2;
                stack.push(duplicate);
            } else if (s.equals("C")) {
                stack.pop();
            } else {
              stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty()) {
         res+=stack.pop();   
        }
        return res;
    }

    public static void main(String args[]) {
        String[] str = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(calPoints(str));
    }
}
