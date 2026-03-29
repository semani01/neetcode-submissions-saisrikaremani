public class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList {

    ListNode head;
    ListNode tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
        ListNode cur = head;
        int i = 0;
        while(cur != null){
            if(i == index){
                return cur.val;
            }
            i++;
            cur = cur.next;
        }

        //if not found
        return -1;
    }

    public void insertHead(int val) {
        //First create a new ListNode
        ListNode newNode = new ListNode(val);

        //Link the new node's next to head node
        newNode.next = head;

        //Now make the new node the head
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        //First, create a new node
        ListNode newNode = new ListNode(val);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        //Link tail to new node
        tail.next = newNode;

        //Make new node the tail
        tail = newNode;
    }

    public boolean remove(int index) {
        if (head == null) return false;

        if (index == 0) {
            if (head == tail) tail = null;
            head = head.next;
            return true;
        }

        int i = 0; 
        ListNode cur = head;
        //O(n) to travser to the desired position
        while(i < index - 1 && cur != null){  //go to 1 index before the index to be removed 
            i++;
            cur = cur.next;
        }

        if(cur != null && cur.next!= null){
            if(cur.next == tail){
                tail = cur;
            }
            cur.next = cur.next.next;  //delinking in O(1) time
            return true;
        }

        return false;        
    }

    public ArrayList<Integer> getValues() {
        //Create arraylist to store node values
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        //Looping through the linked list --> O(n) time
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }

        return list;
    }
}