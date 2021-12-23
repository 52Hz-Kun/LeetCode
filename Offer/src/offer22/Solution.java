package offer22;

import java.util.ArrayList;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        int num = 1;
        while (true){
            if (head.next != null) {
                num ++;
                head = head.next;
                if (num > k) first = first.next;

            }
            else break;
        }
    return first;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}