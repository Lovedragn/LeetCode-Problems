
class Node {
    int data;
    Node next;
}
public class Leet_203 {
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
                System.out.print(" -> " );
            }
            n = n.next;
        }
    }
  public Node removeElements(Node head, int data) {
        Node r = (head != null) ? head.next : null;
        Node mid = head;
        Node l = null;

        while (mid != null) {
            if (mid.data == data) {
                if (l == null) {
                    head = r;
                } else {
                    l.next = r;
                }
            } else {
                l = mid;
            }
            mid = r;
            r = (r != null) ? r.next : null;
        }
        return head;
    }

    
    public static void main(String[] args) {
        Leet_203 LL = new Leet_203();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(13);
        LL.insert(3);
        LL.insert(8);
        //call
        LL.head = LL.removeElements(LL.head,2);

        LL.show();
    }

}
