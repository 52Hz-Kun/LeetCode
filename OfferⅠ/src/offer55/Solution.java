package offer55;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 1);
    }
    public int dfs(TreeNode node, int n) {
        if (node.left == null && node.right == null) return n;
        else if (node.left == null) return dfs(node.right, n + 1);
        else if (node.right == null) return dfs(node.left, n + 1);
        else return Math.max(dfs(node.left, n + 1), dfs(node.right, n + 1));
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
