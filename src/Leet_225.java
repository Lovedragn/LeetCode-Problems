
import java.util.*;

public class Leet_225 {

    public static Queue<Integer> q;

    public static void MyStack() {
        q = new ArrayDeque<>();
    }

    public static void push(int x) {

        q.add(x);
        for (int idx = 0; idx < q.size() - 1; idx++) {
            q.add(q.poll());
        }
    }

    public static int pop() {
        return q.poll();
    }

    public static int top() {
        return q.peek();
    }

    public static boolean empty() {
        return q.isEmpty();
    }

    public static void main(String args[]) {
        MyStack();
        push(1);
        push(2);
        System.out.println(top());
        System.out.println(pop());
        System.out.println(empty());

    }

}
