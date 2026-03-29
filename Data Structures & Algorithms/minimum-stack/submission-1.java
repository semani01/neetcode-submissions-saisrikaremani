class MinStack {

    private List<Integer> minStack;

    public MinStack() {
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        minStack.add(val);
    }
    
    public void pop() {
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return minStack.get(minStack.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(minStack);
    }
}
