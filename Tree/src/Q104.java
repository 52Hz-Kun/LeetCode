/**
 * 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}

class Q104_second {
    int res = 0;
    public int maxDepth(TreeNode root) {
        recur(root, 0);
        return res;
    }
    public void recur(TreeNode root, int depth){
        if (root == null) res = Math.max(res, depth);
        else {
            recur(root.left, depth + 1);
            recur(root.right, depth + 1);
        }
    }
}


