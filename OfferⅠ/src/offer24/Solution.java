package offer24;

import java.util.LinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        while (head != null){
            list.push(head);
            head = head.next;
        }
        int n = list.size();
        ListNode res = list.peek();
        for (int i = 0; i < n; i++) {
            ListNode pop = list.pop();
            if (list.peek() != null){
                pop.next = list.peek();
            } else {
                pop.next = null;
            }
        }
        return res;
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

