class MinStack {

    private List<Integer> stack;
    private List<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);

        int currentMin = minStack.isEmpty() ? val : Math.min(val, minStack.get(minStack.size() - 1));
        minStack.add(currentMin);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1);
    }
}
