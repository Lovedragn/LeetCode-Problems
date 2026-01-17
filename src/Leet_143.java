class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Leet_143 {

    public static ListNode head;
    public static ListNode res;
    public static ListNode res_temp;

    public static void reorderList(ListNode head) {
        res_temp = head;
        // find middle
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null  ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = slow.next;

        // new node to store new values
        recursion_slow(slow);

    }

    public static void recursion_slow(ListNode slow) {
        if (slow.next == null) {
            return;
        }

        recursion_slow(slow.next);

        res.val = res_temp.val;
        res_temp = res_temp.next;
        res = res.next;

        res.val = slow.val;
        res = res.next;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        reorderList(head);
    }
}
