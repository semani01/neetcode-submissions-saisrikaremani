class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();        
    }
    
    public void push(int x) {
        //Step 1: push new element onto the stack
        st1.push(x);
    }
    
    public int pop() {
        // Get a ListIterator starting from the top of the stack
        ListIterator<Integer> listIterator = st1.listIterator(st1.size());

        // Iterate backwards (from top to bottom) and push to the new stack
        while (listIterator.hasPrevious()) {
            Integer element = listIterator.previous();
            st2.push(element);
        }

        //clear st1 so that new stack with popped top can be added back
        st1.clear();
        int top = st2.pop();

        //Transfer back the new stack with top popped
        // Get a ListIterator starting from the top of the stack
        ListIterator<Integer> listIterator2 = st2.listIterator(st2.size());

        // Iterate backwards (from top to bottom) and push to the new stack
        while (listIterator2.hasPrevious()) {
            Integer element = listIterator2.previous();
            st1.push(element);
        }

        //again clear st2 for next pop() or peeK()
        st2.clear();
        return top;

    }
    
    public int peek() {
        // Get a ListIterator starting from the top of the stack
        ListIterator<Integer> listIterator = st1.listIterator(st1.size());

        // Iterate backwards (from top to bottom) and push to the new stack
        while (listIterator.hasPrevious()) {
            Integer element = listIterator.previous();
            st2.push(element);
        }
        int top = st2.peek();
        st2.clear(); //ready for next pop() or peek()
        return top;
    }
    
    public boolean empty() {
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */