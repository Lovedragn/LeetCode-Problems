
class Node {

    int data;
    Node next;
}

public class Leet_206 {

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

    public Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node temp = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev; // Return the new head of the reversed list
    }

    public static void main(String[] args) {
        Leet_206 LL = new Leet_206();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        LL.insert(3);
        LL.insert(8);
        //call
        LL.head = LL.reverseList(LL.head);

        LL.show();
    }

}
