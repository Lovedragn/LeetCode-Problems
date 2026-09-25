
import java.util.*;

class Node {

    int data;
    Node next;
}

public class Leet_19 {

    Node head = null;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data);
            if (n.next != null) {
                System.out.print(" -> ");
            }
            n = n.next;
        }
    }

    public Node removeNthFromEnd(Node head, int n) {

        Stack<Node> stack = new Stack();
        Node current = head;
        while (current != null) {
            stack.add(current);
            current = current.next;
        }
        if (stack.size() == n) {
            return head.next;
        }

        for (int i = 1; i <= n; i++) {
            stack.pop();
        }
        Node prev = stack.pop();
        prev.next = prev.next.next;

        return head;
    }

    public static void main(String[] args) {

        Leet_19 LL = new Leet_19();
        //call methods
        LL.insert(1);
        LL.insert(2);
        LL.insert(1);
        LL.insert(5);

        //call
        LL.head = LL.removeNthFromEnd(LL.head, 2);

        LL.show();
    }
}
