class MinStack {

    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        //Two parallel stacks, one holds the actual values, the other tracks the minimum for every corresponding position
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int value) {
        stack.add(value);

        //The new minimum is either value or whatever the running minimum is at this point
        int minimumValue = minStack.isEmpty() ? value : Math.min(value, minStack.get(minStack.size() - 1));
        minStack.add(minimumValue);
    }
    
    public void pop() {
        //Remove from both so both stacks are in sync
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);    
    }
    
    public int getMin() {
        //minStack's top is always the current minimum
        return minStack.get(minStack.size() - 1);
    }
}

//Time: O(1) for all operations
//Space: O(n) for n values being stored in stacks

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */