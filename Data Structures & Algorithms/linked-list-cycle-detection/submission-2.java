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
    public boolean hasCycle(ListNode head) {
        //Iterate through the linked list
        //While iterating keep track of node values in a hashSet
        //If duplicates encountered, i.e., if(set.contains(curr.next.val)) return true
        //If none found, return  false

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head; 

        while(curr != null){
            if(set.contains(curr)){
                return true;
            }

            set.add(curr);
            curr = curr.next;
        }

        return false;
    }
}
