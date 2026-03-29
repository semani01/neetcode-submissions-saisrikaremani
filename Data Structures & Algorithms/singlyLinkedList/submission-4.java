class LinkedList {
    
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    int size;
    ListNode dummyHead;

    public LinkedList() {
        this.size = 0;
        dummyHead = new ListNode(0); //a dummy node connected to the actual first node in list
    }

    //We iterate from dummyHead.next to the index and return the value
    public int get(int index) {
        if(index < 0 || index >= size) return -1; 

        ListNode curr = dummyHead.next;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }

        return curr.val;
    }

    public void insertHead(int val) {
        insertAtIndex(0, val);
    }

    public void insertTail(int val) {
        insertAtIndex(size, val);
    }

    /*We stop at the node just before index, i.e. the pred node, then we connect the 
    new node's next to pred.next and then pred.next = newNode*/
    public void insertAtIndex(int index, int val){
        if(index > size) return; //out of bound, cannot insert
        if(index < 0) index = 0; //if index is -ve, we treat it as 0

        size++;
        ListNode pred = dummyHead;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = pred.next;
        pred.next = newNode;
    }

    /*Similar to insertion: stop at node before target, skip over target by doing
    pred.next = pred.next.next*/
    public boolean remove(int index) {
      if(index < 0 || index >= size) return false;  

      size--;
      ListNode pred = dummyHead;
      for(int i = 0; i < index; i++){
        pred = pred.next;
      }

      pred.next = pred.next.next;
      return true;
    }

    /*Simple iteration through the linked list and appending to an arraylist */
    public List<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode iter = dummyHead.next;
        
        while(iter != null){
            list.add(iter.val);
            iter = iter.next;
        }

        return list;
    }
}