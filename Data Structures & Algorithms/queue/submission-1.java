class ListNode{

    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val){
        this.val = val;
        prev = null;
        next = null;
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
        return head == null;
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if(tail != null){
            //Queue is not empty
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            //Queue is empty
            head = newNode;
            tail = newNode;
        }
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        if(head != null){
            //Queue is not empty
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            //Queue is empty
            head = newNode;
            tail = newNode;
        }
    }

    public int pop() {
        if(tail == null){
            //Queue is empty
            return -1;
        }
        int val = tail.val;
        if(head == tail){
            val = head.val;
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return val;
    }

    public int popleft() {
        int val;
        if (head == null) {
            //Queue is empty
            return -1;
        }
        val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return val;
    }
}
