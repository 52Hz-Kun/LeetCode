package offer32_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 12.8再做
 */
//public class Solution1 {
//    Queue<TreeNode> queue = new LinkedList<>();
//    ArrayList<Integer> list = new ArrayList<>();
//    ArrayList<int[]> listAll = new ArrayList<>();
//    public int[] levelOrder(TreeNode root){
//        if (root != null) queue.offer(root);
//        while (!queue.isEmpty()){
//            for (int i = queue.size(); i > 0 ; i--) {
//                TreeNode poll = queue.poll();
//                if (poll.left != null) queue.offer(poll.left);
//                if (poll.right != null) queue.offer(poll.right);
//                list.add(poll.val);
//            }
//            list.toArray(new int[list.size()]);
//            listAll.add();
//        }
//
//        int[] res = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = list.get(i);
//        }
//        return res;
//    }
//}
