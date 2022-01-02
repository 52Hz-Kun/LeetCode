package offer18;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode listNode = new ListNode(head.val);
        listNode.next = head.next;
        int num = 0;
        while (true){

            if (listNode.next.val == val){
                listNode.next = listNode.next.next;
                head = num == 0 ? listNode : head;
                break;
            } else {
                listNode = listNode.next;
            }
            num++;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}