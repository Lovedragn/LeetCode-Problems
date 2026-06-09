public class Leet_61 {
    public static Node head;
    public static Node tail;

    public static Node rotateRight(Node head, int k) {
        tail = head;
        int len = ListSize(k);
        tail.next = head;
        
        for (int i = 1; i <= k % len; i++) {
            head = head.next;
        }

        Node newHead = head.next; 
        head.next = null;


        return newHead;
    }

    public static int ListSize(int k) {
        int len = 1;

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        return len;
    }

    public static void main(String[] args) {
        LL ll = new LL();
        int arr[] = { 3, 2, 0, -4 };

        for (int i = 0; i < arr.length; i++) {
            ll.insert(arr[i]);
        }

        ll.head = rotateRight(ll.head, 1);
        ll.show();

    }
}
