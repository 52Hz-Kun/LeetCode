package offer41;

import org.w3c.dom.NodeList;

public class MedianFinder {
    ListNode head = new ListNode(0);
    int length = 0;

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        ListNode temp = head;
        ListNode node = new ListNode(num);
        if (head.next == null) head.next = node;
        else {
            while (temp.next != null){
                if (num < temp.next.val){
                    node.next = temp.next;
                    break;
                } else temp = temp.next;
            }
            temp.next = node;
        }
        length++;
    }

    public double findMedian() {
        int k;
        double res = 0.0;
        ListNode temp = head;
        if ((length & 1) == 1) {
            k = length / 2 + 1;
            while (k > 0){
                temp = temp.next;
                res = temp.val;
                k--;
            }
        }
        else {
            k = length / 2;
            while (k > 0){
                temp = temp.next;
                res = temp.val;
                k--;
            }
            res = (res + temp.next.val) / 2;
        }
        return res;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
