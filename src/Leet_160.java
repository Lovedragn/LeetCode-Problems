
class Node {

    int data;
    Node next;
}

public class Leet_160 {

    Node head = null;
    Node head2 = null;

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

    public void insert1(int data) {
        Node node2 = new Node();
        node2.data = data;
        node2.next = null;

        if (head2 == null) {
            head2 = node2;
        } else {
            Node n2 = head2;
            while (n2.next != null) {
                n2 = n2.next;
            }
            n2.next = node2;
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

    public Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;
        int sizeA = 0;
        int sizeB = 0;

        while (a != null) {
            sizeA++;
            a = a.next;
        }
        while (b != null) {
            sizeB++;
            b = b.next;
        }

        int cal = Math.abs(sizeA - sizeB);
        a = headA;
        b = headB;

        if (sizeA > sizeB) {
            while (cal-- > 0) {
                a = a.next;
            }
        } else {
            while (cal-- > 0) {
                b = b.next;
            }
        }

        while (a != b) {
            a = a.next;
            b = b.next;
            if (a == null || b == null) {
                return null;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Leet_160 LL = new Leet_160();
        //call methods
        LL.insert(15);
        LL.insert(2);
        LL.insert(13);

        LL.insert1(5);
        LL.insert1(2);
        LL.insert1(1223);

        //call
        LL.head = LL.getIntersectionNode(LL.head, LL.head2);

        LL.show();
    }
}
