
import java.util.*;

public class Leet_232 {

    public static Stack<Integer> stack;

    public static void MyQueue() {
        stack = new Stack<>();
    }

    public static void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
        } else {
            int top = stack.pop(); 
            push(x);           
            stack.push(top);  
        }

    }

    public static int pop() { 
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return stack.pop();
    }

    public static int peek() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return stack.peek();
    }

    public static boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue();
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(empty());
    }
}
