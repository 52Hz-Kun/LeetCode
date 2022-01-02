/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode q = dummy;
        int behind = n - 1;
        while (head != null){
            p.next = head;
            head = head.next;
            p = p.next;
            q = behind == 0 ? q.next : q;
            behind = behind != 0 ? behind - 1 : 0;
        }
        q.next = q.next.next;
        return dummy.next;
    }
}
