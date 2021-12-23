package 最大深度;

public class Solution2 {
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
