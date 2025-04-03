
class Node {

    int data;
    Node next;
}

public class Leet_2181 {

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

    public Node mergeNodes(Node head) {
        Node res = null;// 0 8 2 0 10 8 0
        Node reshead = null;
        Node current = head;

        while (current != null) {
            if (current.data == 0) {
                current = current.next;
                int count = 0;
                while (current != null && current.data != 0) {
                    count += current.data;
                    current = current.next;
                }
                if (count > 0) {
                    Node temp = new Node();
                    temp.data = count;

                    if (reshead == null) {
                        reshead = temp;
                        res = reshead;
                    } else {
                        res.next = temp;
                        res = res.next;
                    }
                }
            } else {
                current = current.next;
            }
        }
        return reshead;
    }

    public static void main(String[] args) {
        Leet_2181 LL = new Leet_2181();
        //call methods
        LL.insert(1);
        LL.insert(0);
        LL.insert(0);
        LL.insert(21);
        //call
        LL.head = LL.mergeNodes(LL.head);
        LL.show();
    }
}
