package offer32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[]{};
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            res.add(queue.peek().val);
            TreeNode node = queue.poll();
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

        }
        int[] re = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            re[i] = res.get(i);
        return re;
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

