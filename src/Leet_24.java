
public class Leet_24 {

    class Node {

        int data;
        Node next;
    }

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

    public Node swapPairs(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            int swap = temp.data;
            temp.data = temp.next.data;
            temp.next.data = swap;
            temp = temp.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Leet_24 LL = new Leet_24();
        //call methods
        LL.insert(1);
        LL.insert(2);
        LL.insert(3);
        LL.insert(4);
        //call
        LL.head = LL.swapPairs(LL.head);
        LL.show();
    }
}
