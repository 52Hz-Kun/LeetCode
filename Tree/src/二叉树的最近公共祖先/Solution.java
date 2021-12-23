package 二叉树的最近公共祖先;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p) return root;
        if (root == q) return root;
        TreeNode P = lowestCommonAncestor(root.left, p, q);
        TreeNode Q = lowestCommonAncestor(root.right, p, q);
        if (P != null && Q != null) return root;
        else if (P != null) return P;
        else return Q;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
