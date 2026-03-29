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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(true){
            // 1. Find the smallest node among all current heads
            // 2. If no "smallest" was found (all heads are null), break the loop
            // 3. Otherwise, append that smallest node to your result and move its pointer
            int minValue = Integer.MAX_VALUE;
            int list = 0;
            //scanning k lists to get min node
            for(int i = 0; i < lists.length; i++){
                if(lists[i] == null){
                    continue;
                }

                if(lists[i].val <= minValue){
                    minValue = lists[i].val;
                    list = i;
                }
            }
            if(minValue == Integer.MAX_VALUE){
                break;
            }
            ListNode newNode = new ListNode(minValue);
            curr.next = newNode;
            lists[list] = lists[list].next;
            curr = curr.next;
            curr.next = null;
        }
        return dummy.next;    
    }
}
