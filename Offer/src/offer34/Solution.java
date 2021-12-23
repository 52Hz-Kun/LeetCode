package offer34;

import java.util.LinkedList;
import java.util.List;

/**
 * 错的！
c */
public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, new LinkedList<>(), 0, target);
        return res;
    }

    void dfs(TreeNode node, LinkedList<Integer> list, int s, int target){
        s = s + node.val;
        if (node.left == null && node.right == null && s == target) res.add(list);
        if (node.left == null && node.right == null) return;
        if (node.left == null) {
            list.add(node.right.val);
            node = node.right;
            dfs(node, list, s, target);
        } else if (node.right == null){
            list.add(node.left.val);
            node = node.left;
            dfs(node, list, s, target);
        } else {
            list.add(node.left.val);
            node = node.left;
            dfs(node, list, s, target);
            list.add(node.right.val);
            node = node.right;
            dfs(node, list, s, target);//这里应该用node.left或者right进行调用，不然回溯不了
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}