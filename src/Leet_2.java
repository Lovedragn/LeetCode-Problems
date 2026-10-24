class Node {
    int data;
    Node next;
}

public class Leet_2 {

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
            n = n.next;
            if (n != null) {
                System.out.print(" -> ");
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // iterate L1 & L2
        ListNode dummy_l1 = l1;
        ListNode dummy_l2 = l2;

        int carry = 0;
        while (dummy_l1 != null || dummy_l2 != null) {
            int total = 0;

            if (dummy_l1 != null) {
                total += dummy_l1.val;
            }
            if (dummy_l2 != null) {
                total += dummy_l2.val;
            }

            total += carry;
            carry = total / 10;
            total = total % 10;

            if (dummy_l1 != null) {
                dummy_l1.val = total;

                if (dummy_l1.next == null && dummy_l2 != null && dummy_l2.next != null) {
                    dummy_l1.next = new ListNode(0);
                }

                if (dummy_l1.next == null && (carry != 0 || (dummy_l2 != null && dummy_l2.next != null))) {
                } else {
                    dummy_l1 = dummy_l1.next;
                }
            }

            if (dummy_l2 != null) {
                dummy_l2 = dummy_l2.next;
            }
        }

        // remaining carry
        while (carry != 0) {
            int last = carry % 10;
            carry /= 10;
            ListNode newnode = new ListNode();
            newnode.val = last;
            dummy_l1.next = newnode;
            dummy_l1 = dummy_l1.next;
        }

        return l1;
    }

    public static void main(String[] args) {
        Leet_2 LL = new Leet_2();
        // call methods
        LL.insert(9);
        LL.insert(9);
        LL.insert(9);

        LL.insert1(1);

        // call
        LL.head = LL.addTwoNumbers(LL.head, LL.head2);

        LL.show();
    }

}
