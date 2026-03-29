class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class MyStack {

    private ListNode head;
    private ListNode tail;

    public MyStack() {
        this.head = null;
        this.tail = null;
    }
    
    public void push(int x) { //insertLast
        ListNode newNode = new ListNode(x);

        if(empty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public int pop() {  //deleteLast()
        if(empty()) return -1;;
        int popped;

        if(head != null && head.next == null){ //handling single-element case
            popped = head.val;
            head = tail = null;
        } else {
            popped = tail.val;
            tail = tail.prev;
            tail.next = null;
        }
        return popped;
    }
    
    public int top() { //getRear
        return empty() ? -1 : tail.val;
    }
    
    public boolean empty() { 
        return head == null;
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