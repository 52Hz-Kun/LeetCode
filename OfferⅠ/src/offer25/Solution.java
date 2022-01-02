package offer25;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode r = new ListNode(0);
        ListNode res = r;
        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                if (l1.val > l2.val){
                    r.next = l2;
                    r= r.next;
                    l2 = l2.next;
                } else {
                    r.next = l1;
                    r= r.next;
                    l1 = l1.next;
                }
            } else if (l1 == null){
                r.next = l2;
                r= r.next;
                l2 = l2.next;
            } else{
                r.next = l1;
                r= r.next;
                l1 = l1.next;
            }
        }
        res = res.next;
        return res;
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

