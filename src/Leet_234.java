
import java.util.ArrayList;
import java.util.List;

class Node {

    int data;
    Node next;
}

public class Leet_234 {

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

    public boolean isPalindrome(Node head) {
        Node node = head;
        List<Integer> list = new ArrayList<>();

        while (node != null) {
            list.add(node.data);
            node = node.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            if (list.get(l).equals(list.get(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leet_234 LL = new Leet_234();
        //call methods
        LL.insert(5);
        LL.insert(2);
        LL.insert(5);

        //call
        System.out.println(LL.isPalindrome(LL.head));

        LL.show();
    }
}
