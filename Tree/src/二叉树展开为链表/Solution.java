package 二叉树展开为链表;

import 路径总和.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    public void flatten(TreeNode root) {
        if (root == null) return;
        flat(root);
        while (queue.size() > 1){
            TreeNode poll = queue.poll();
            poll.right = queue.peek();
            poll.left = null;
        }
        queue.peek().left = null;
        queue.peek().right = null;
    }
    public void flat(TreeNode root){
        if (root == null) return;
        queue.offer(root);
        if (root.left != null) flat(root.left);
        if (root.right != null) flat(root.right);
    }
}
