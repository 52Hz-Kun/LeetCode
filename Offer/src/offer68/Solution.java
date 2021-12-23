package offer68;

public class Solution {
    TreeNode res = new TreeNode(0);
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        TreeNode pp = lowestCommonAncestor(root.left, p, q);
        TreeNode qq = lowestCommonAncestor(root.right, p, q);

        if (pp != null && qq != null) {
            return root;
        }
        else if (pp != null) return pp;
        else return qq;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

