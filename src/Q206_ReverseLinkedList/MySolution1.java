package Q206_ReverseLinkedList;

/**
 * Created by marklee on 8/11/16.
 *
 * Reverse a singly linked list.
 *
 * Need some imagination.
 * 1ms, 4.48%
 */
public class MySolution1 {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode reverse = reverseList(head.next);
        // reference
        head.next = null;
        head.next.next = head;
        return reverse;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = new ListNode(4);
        ListNode result = reverseList(n1);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
