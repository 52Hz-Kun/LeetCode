package 前序和中序遍历构建二叉树;

import java.util.HashMap;

public class Solution {
    int preIndex;
    int[] inOrder;
    int[] preOrder;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        inOrder = inorder;
        preOrder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, preorder.length - 1);
    }

    public TreeNode helper(int in_left, int in_right){
        if (in_left > in_right) return null;
        TreeNode treeNode = new TreeNode(preOrder[preIndex]);
        Integer in = map.get(preOrder[preIndex]);
        preIndex ++;
        treeNode.left = helper(in_left, in - 1);
        treeNode.right = helper(in + 1, in_right);
        return treeNode;
    }
}
