package offer30;

import java.util.LinkedList;

class MinStack {

    LinkedList<Integer> datastack;
    LinkedList<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack() {
        datastack = new LinkedList<>();
        minstack = new LinkedList<>();
    }

    public void push(int x) {
        datastack.push(x);
        if (minstack.isEmpty() || minstack.peek() > x){
            minstack.push(x);
        } else {
            minstack.push(minstack.peek());
        }
    }

    public void pop() {
        datastack.pop();
        minstack.pop();

    }

    public int top() {
        return datastack.peek();

    }

    public int min() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
