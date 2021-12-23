package 二叉树的直径;

import 路径总和.TreeNode;

public class Solution {
    int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int temp = maxDepth(root.left) + maxDepth(root.right);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        if (temp > res) res = temp;
        return res;
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
