import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Try {

    public static void main(String[] args) {
        // 栈
        // 通常情况下，不推荐使用 Java 的 Vector 以及其子类 Stack ，而一般将 LinkedList 作为栈来使用
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.removeLast();
        stack.removeLast();

        // 队列
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.poll();
        queue.poll();




    }
}
