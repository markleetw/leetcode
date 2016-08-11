package Q237_DeleteNodeInALinkedList;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Write a function to delete a node (except the tail) in a singly linked list,
 * given only access to that node.
 * <p>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third
 * node with value 3, the linked list should become 1 -> 2 -> 4 after calling
 * your function.
 *
 * Couldn't be better.
 * 1ms, 2.65%
 */
public class MySolution1 {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
