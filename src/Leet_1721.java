
class Node {

    int data;
    Node next;
}

public class Leet_1721 {

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

    public Node swapNodes(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node first = head, second = head, current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        if (k > length) {
            return head;
        }

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        for (int i = 1; i <= length - k; i++) {
            second = second.next;
        }

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return head;
    }

    public static void main(String[] args) {
        Leet_1721 LL = new Leet_1721();
        //call methods
        LL.insert(11);
        LL.insert(2);
        LL.insert(1);
        LL.insert(16);

        //call
        LL.head = LL.swapNodes(LL.head, 1);
        LL.show();
    }
}
