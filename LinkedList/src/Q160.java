/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        boolean flag = false;
        while (headA != headB){
            if (headA == null){
                if (flag) break;
                headA = B;
                flag = true;
            } else headA = headA.next;
            headB = headB == null ? A : headB.next;
        }
        return headB == null ? null :headA;
    }
}
