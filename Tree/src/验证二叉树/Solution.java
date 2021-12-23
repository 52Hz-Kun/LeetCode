package 验证二叉树;

/**
 * 没写完，不会写...
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if ((root.left != null && root.left.val > root.val) && (root.right != null && root.right.val < root.val)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public boolean isValid(TreeNode root, long lower, long upper){
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
