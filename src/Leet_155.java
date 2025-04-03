
import java.util.*;

public class Leet_155 {

    public static Stack<Integer> minstack = new Stack<>();
    public static Stack<Integer> stack = new Stack<>();

    public static Stack MinStack() {
        return new Stack();
    }

    public static void push(int val) {
        stack.push(val);
        if (minstack.isEmpty() || minstack.peek() >= stack.peek() ) {
            minstack.push(val);
        }
    }

    public static void pop() {
        if (stack.pop().equals(minstack.peek())) {
            minstack.pop();
        }
    }

    public static int top() {
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.peek();
    }

    public static int getMin() {
        if (minstack.isEmpty()) {
            return 0;
        }
        return minstack.peek();
    }

    public static void main(String[] args) {
        MinStack();
        push(1);
        push(-1);
        push(1);
        getMin();
        pop();
        top();
        System.out.println(getMin());
    }
}
