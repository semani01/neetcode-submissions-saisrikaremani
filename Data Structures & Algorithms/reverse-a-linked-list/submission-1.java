/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //Brute force
        //Handling null values/empty lists
        if(head == null){
            return head;
        }

        //Create arraylist, add nodes from LL to arraylist, reverse arraylist, create new LL
        List<Integer> list = new ArrayList<>();

        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }

        Collections.reverse(list);
        
        ListNode newHead = new ListNode(list.get(0));
        ListNode newCur = newHead;
        for(int i = 1; i < list.size(); i++){
            newCur.next = new ListNode();
            newCur.next.val = list.get(i);
            newCur = newCur.next;
        }
        
        ListNode iter = newHead;
        while(iter != null){
            System.out.print(iter.val + " -> ");
            iter = iter.next;
        }

        return newHead;
    }
}
