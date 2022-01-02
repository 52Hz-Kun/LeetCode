package offer32__;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> stack1 = new LinkedList<>();
        LinkedList<TreeNode> stack2 = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) stack1.push(root);
        boolean flag = true; // true时为左右节点，false时为右左节点
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            if (flag){
                for(int i = stack1.size(); i > 0; i--) {
                    TreeNode node = stack1.pop();
                    tmp.add(node.val);
                    if(node.left != null) stack2.push(node.left);
                    if(node.right != null) stack2.push(node.right);
                }
            } else {
                for(int i = stack2.size(); i > 0; i--) {
                    TreeNode node = stack2.pop();
                    tmp.add(node.val);
                    if(node.right != null) stack1.push(node.right);
                    if(node.left != null) stack1.push(node.left);
                }
            }
            res.add(tmp);
            flag = !flag;
        }
        return res;
    }

    @Test
    public void test(){
        TreeNode t1 = new TreeNode(1);

        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.right = t5;
        List<List<Integer>> lists = levelOrder(t1);
        System.out.println(lists);

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

