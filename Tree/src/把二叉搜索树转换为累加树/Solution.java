package 把二叉搜索树转换为累加树;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode temp = root;
        TreeNode temp1 = root;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                root = pop.right;
            }
        }
        for (int i = list.size() - 2; i >= 0; i--) {
            list.set(i, list.get(i) + list.get(i + 1));
        }

        int index = 0;
        Deque<TreeNode> stack1 = new ArrayDeque<>();
        while (temp != null || !stack1.isEmpty()) {
            if (temp != null) {
                stack1.push(temp);
                temp = temp.left;
            } else {
                TreeNode pop = stack1.pop();
                pop.val = list.get(index);
                index++;
                temp = pop.right;
            }
        }
        return temp1;
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