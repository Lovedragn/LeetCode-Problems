
class Node {

    int data;
    Node next;
}

public class Leet_21 {

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

    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node();
        Node current = dummy;
        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Leet_21 LL = new Leet_21();
        //call methods
        LL.insert(1);
        LL.insert(3);
        LL.insert(13);

        LL.insert1(1);
        LL.insert1(4);
        LL.insert1(5);

        //call
        LL.head = LL.mergeTwoLists(LL.head, LL.head2);

        LL.show();
    }
}
