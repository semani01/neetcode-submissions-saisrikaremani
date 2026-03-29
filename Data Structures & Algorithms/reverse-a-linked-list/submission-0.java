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

    ListNode head;
    ListNode tail;

    Solution() {
        head = new ListNode();
        tail = new ListNode();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Save the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to this node
            curr = next; // Move to next node
        }

        return prev;
    }
}