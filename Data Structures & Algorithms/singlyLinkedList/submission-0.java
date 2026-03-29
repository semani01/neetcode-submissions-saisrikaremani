class ListNode0{
    int val;
    ListNode0 next;

    ListNode0(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    ListNode0 head;
    ListNode0 tail;
    public LinkedList() {
        head = null;
        tail = null;
    }
    public int get(int index) {
        int count = 0;
        ListNode0 curr = head;
        while(curr != null){
            if(index == count){
                return curr.val;
            }
            count++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode0 newNode = new ListNode0(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode0 newNode = new ListNode0(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int index) {
        if(head == null){
            return false; //empty list
        }

        if(index == 0) {
            head = head.next;
            if(head == null)
                tail = null;

            return true;
        }

        int i = 0;
        ListNode0 curr = head;
        while(i < index - 1 && curr != null){
            i++;
            curr = curr.next;
        }

        if(curr == null || curr.next == null){
            return false;  //indedx out of bounds
        }

        if(curr.next == tail){
            tail = curr;
        }

        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode0 curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        return list;
    }
}
