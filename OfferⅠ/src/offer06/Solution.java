package offer06;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        while (head != null){
            list.push(head.val);
            head = head.next;
        }
        int n = list.size();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = list.pop();
        }
        return res;
    }

    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;

        int[] ints = reversePrint(l1);
        System.out.println(Arrays.toString(ints));

    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

