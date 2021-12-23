package 前序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class iter {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //加个边界条件判断
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);//压栈
        while (!stack.empty()) {
            TreeNode t1 = stack.pop();//出栈
            res.add(t1.val);
            if (t1.right != null) {
                stack.push(t1.right);
            }
            if (t1.left != null) {
                stack.push(t1.left);
            }
        }
        return res;
    }
}