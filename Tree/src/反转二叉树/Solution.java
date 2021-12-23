package 反转二叉树;

import 路径总和.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invert(root);
        return root;
    }
    public void invert(TreeNode node){
        if (node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invert(node.left);
        invert(node.right);
    }

}
