
import java.util.*;

class Node {

    int data;
    Node next;
}

public class Leet_83 {

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

    public Node deleteDuplicates(Node head) {
        Node n = head;
        Node prev = null;
        Set<Integer> set = new HashSet<>();

        while (n != null) {
            if (!set.contains(n.data)) {
                set.add(n.data);
                prev = n;
            } else {
                prev.next = n.next;
            }
            n = n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Leet_83 LL = new Leet_83();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        LL.insert(3);
        LL.insert(8);
        //call
        LL.head = LL.deleteDuplicates(LL.head);

        LL.show();
    }

}
