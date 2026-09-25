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
    
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node();
        Node res = dummy;
        int total = 0, carry = 0;
    
        while (l1 != null || l2 != null || carry != 0) {
            total = carry;
    
            if (l1 != null) {
                total += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.data;
                l2 = l2.next;
            }
    
            int num = total % 10;
            carry = total / 10;
    
            dummy.next = new Node();
            dummy = dummy.next;
            dummy.data = num; // Assign value to the new node
        }
    
        return res.next;
    }
    public static void main(String[] args) {
        Leet_2 LL = new Leet_2();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        LL.insert(3);
        LL.insert(8);

        LL.insert1(5);
        LL.insert1(2);
        LL.insert1(13);
        LL.insert1(3);
        LL.insert1(8);
        //call
        LL.head = LL.addTwoNumbers(LL.head,LL.head2);

        LL.show();
    }

}
