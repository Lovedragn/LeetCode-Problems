
class Node {

    int data;
    Node next;
}

public class Leet_1669 {

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

    public Node mergeInBetween(Node list1, int a, int b, Node list2) {
        if (list1 == null || list2 == null) {
            return list1;
        }
        Node node = list1;
        for (int i = 1; i < a; i++) {
            node = node.next;
        }
        Node temp = node;
        for (int i = 0; i <= (b - a + 1); i++) {
            temp = temp.next;
        }
        //
        //
        node.next = list2;
        Node tt = list2;
        while (tt.next != null) {
            tt = tt.next;
        }
        tt.next = temp;
        return list1;
    }

    public static void main(String[] args) {
        Leet_1669 LL = new Leet_1669();
        //call methods
        LL.insert(1);
        LL.insert(0);
        LL.insert(0);
        LL.insert(21);
        //call
        LL.head = LL.mergeInBetween(LL.head, 1, 2, LL.head2);
        LL.show();

    }

}
