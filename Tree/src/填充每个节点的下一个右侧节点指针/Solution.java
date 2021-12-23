package 填充每个节点的下一个右侧节点指针;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()){
            for (int i = queue.size(); i > 0; i--) {
                Node poll = queue.poll();
                poll.next = i == 1 ? null : queue.peek();
                if (poll.left != null) {
                    queue.offer(poll.left);
                    queue.offer(poll.right);
                }
            }
        }
     return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
