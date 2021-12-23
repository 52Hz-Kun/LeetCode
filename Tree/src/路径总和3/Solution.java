package 路径总和3;

import 路径总和.TreeNode;

import java.util.ArrayList;

class Solution {
    int result = 0;
    public int pathSum(TreeNode root, int targetSum) {
        sum(root, new ArrayList<>(), targetSum);
        return result;
    }

    public void sum(TreeNode node, ArrayList<Integer> list, int target){
        if (node == null) return;
        ArrayList<Integer> now = new ArrayList<>();
        now.add(node.val);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            now.add(node.val + list.get(i));

        }
        for (int i = 0; i < now.size(); i++) {
            if (now.get(i) == target) result++;
        }
        if (node.left != null) sum(node.left, now, target);
        if (node.right != null) sum(node.right, now, target);
    }
}
