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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //Handling edge cases
        //If list1 or list2 is empty
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        //if both lists are empty
        if(list1 == null && list2 == null) return list1;

        //Creating a new list head
        ListNode dummy = new ListNode();

        //Traversing both of the lists and appending to new list
        //1. Creating pointers to move along the lists
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode curr3 = dummy;

        //2. Looping through list1 and list2
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                curr3.next = curr1;
                curr1 = curr1.next;
            } else {
                curr3.next = curr2;
                curr2 = curr2.next;
            }
            curr3 = curr3.next;
        }

        if(curr1 != null){
            curr3.next = curr1;
        }

        if(curr2 != null){
            curr3.next = curr2;
        }

        return dummy.next;
    } 
}