package 路径总和;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return targetSum == 0;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public boolean hasPathSum1(TreeNode root, int sum) {
        //如果根节点为空，或者叶子节点也遍历完了也没找到这样的结果，就返回false
        if (root == null)
            return false;
        //如果到叶子节点了，并且剩余值等于叶子节点的值，说明找到了这样的结果，直接返回true
        if (root.left == null && root.right == null && sum - root.val == 0)
            return true;
        //分别沿着左右子节点走下去，然后顺便把当前节点的值减掉，左右子节点只要有一个返回true，
        //说明存在这样的结果
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
