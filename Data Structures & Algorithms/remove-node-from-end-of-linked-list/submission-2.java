/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {\ this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */                                           
                                           
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //Step 1: Find length of linked list
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }

        System.out.println("Length of LL:" + length);

        //Step 2: Calculate and find out node to remove
        int nodePosition = length - n;

        System.out.println("Position to remove node:" + nodePosition);

        // Special case: removing the head node
        if (nodePosition == 0) {
            return head.next;
        }

        //Step 3: Go to (nodePosition - 1) and perform deletion
        int i = 0;
        ListNode iter = head;
        while(iter != null && i < nodePosition - 1){
            i++;
            iter = iter.next;
        }
        
        if (iter != null && iter.next != null) {
            iter.next = iter.next.next;
        }


        return head;                                                                                                                                                                                      
    }
}