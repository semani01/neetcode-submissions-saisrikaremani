class MyStack {

    //Implementation of Stack using a single Queue
    //Declare a queue
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        //1. Add(offer) new element to end of queue 
        q.offer(x);

        //2. Loop: -calculate the current size of queue(minus the new element) and rotate it
        // -by doing this n-1 times, our new element comes to the front of the queue
        for(int i = q.size() - 1; i > 0; i--){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */