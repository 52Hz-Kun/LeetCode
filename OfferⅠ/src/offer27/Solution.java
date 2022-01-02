package offer27;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode treeNode = new TreeNode(root.val);
        treeNode.left = root.right;
        treeNode.right = root.left;
        mirrorTree(root.right);
        mirrorTree(root.left);
        root = treeNode;
        return root;
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

