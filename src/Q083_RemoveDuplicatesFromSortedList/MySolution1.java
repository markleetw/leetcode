package Q083_RemoveDuplicatesFromSortedList;

/**
 * Created by marklee on 8/12/16.
 */
public class MySolution1 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head = deleteDuplicates(head.next);
            } else {
                head.next = deleteDuplicates(head.next);
            }
        }
        return head;
    }

    public static void main(String[] args) {
    }
}
