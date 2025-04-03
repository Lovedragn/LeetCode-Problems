
class Node {

    int data;
    Node next;
}

public class Leet_876 {

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

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null) {
            if (fast.next == null) {
                head = slow;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public static void main(String[] args) {
        Leet_876 LL = new Leet_876();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        //call
        LL.head = LL.middleNode(LL.head);

        LL.show();
    }
}
