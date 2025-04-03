
class Node {

    int data;
    Node next;
}

public class Leet_2487 {

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

    public Node removeNodes(Node head) {
        if (head == null) {
            return null;
        }

        int maxValue = Integer.MIN_VALUE;
        Node node = head;

        while (node != null) {
            maxValue = Math.max(maxValue, node.data);
            node = node.next;
        }

        Node dummy = new Node();
        Node temp = dummy;
        node = head;

        while (node != null) {
            if (node.data >= maxValue) {
                temp.next = new Node();
                temp = temp.next;
                temp.data = node.data;
            }
            node = node.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Leet_2487 LL = new Leet_2487();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);

        //call
        LL.head = LL.removeNodes(LL.head);

        LL.show();
    }

}
