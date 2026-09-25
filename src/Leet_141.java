
class Node {
    int data;
    Node next;
}

public class Leet_141 {

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

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Leet_141 LL = new Leet_141();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        LL.insert(3);
        LL.insert(8);
        //call
        LL.hasCycle(LL.head);

        LL.show();
    }

}
