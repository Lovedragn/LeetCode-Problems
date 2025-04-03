
public class Leet_237 {

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

    public void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
        head = node;
    }

    public static void main(String[] args) {
        Leet_237 LL = new Leet_237();
        //call methods
        LL.insert(1);
        LL.insert(2);
        LL.insert(1);

        //call
        LL.deleteNode(LL.head);

        LL.show();
    }

}
