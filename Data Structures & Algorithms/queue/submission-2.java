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

class Deque {

    ListNode head;
    ListNode tail;

    public Deque() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    public void append(int value) {
       ListNode newNode = new ListNode(value);
       if(tail != null){ //Queue is not empty
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
       } else{ //Queue is empty
        head = newNode;
        tail = newNode;
       }
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        if(head != null){ //Queue is not empty
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else { //Queue is empty
            head = newNode;
            tail = newNode;
        }
    }

    public int pop() {
        if(head == null){ //empty queue
            return -1;
        } 
        if(head != null && head.next == null){
            int val = head.val;
            head = null;
            tail = null;
            return val;
        }
        int val = tail.val;
        ListNode newTail = tail.prev;
        newTail.next = null;
        tail = newTail;

        return val;
    }

    public int popleft() {
        if(head == null){ //empty queue
            return -1;
        }
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        } 
        return val;
    }
}
