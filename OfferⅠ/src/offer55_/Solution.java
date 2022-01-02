package offer55_;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (depth(root, 0) != -1) return true;
        return false;
    }
    public int depth(TreeNode node, int n){

        if (node == null) return n;
        int left = depth(node.left, n + 1);
        int right = depth(node.right, n + 1);
        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) < 2) return Math.max(left, right);
        else return -1;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
