
class Node {

    int data;
    Node next;
}

public class Leet_1290 {

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

    public int getDecimalValue(Node head) {
        StringBuilder res = new StringBuilder();
        Node node = head;

        while (node != null) {
            res.append(node.data);
            node = node.next;
        }
        System.out.println(res);
        int decimalValue = Integer.parseInt(res.toString(), 2);
        return decimalValue;

    }

    public static void main(String[] args) {
        Leet_1290 LL = new Leet_1290();
        //call methods
        LL.insert(1);
        LL.insert(0);
        LL.insert(1);

        //call
        LL.getDecimalValue(LL.head);

        LL.show();
    }
}
