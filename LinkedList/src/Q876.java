/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Q876 {
    public ListNode middleNode(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast != null){
            slow = slow.next;
            fast = fast.next == null ? null : fast.next.next;
        }
        return slow;
    }
}
