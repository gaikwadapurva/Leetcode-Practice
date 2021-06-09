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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                temp.val = (l2.val + carry) % 10;
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            }
            if (l2 == null && l1 != null) {
                temp.val = (l1.val + carry) % 10;
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            }
            if (l1 != null && l2 != null) {
                temp.val = (l1.val + l2.val + carry) % 10;
                carry = (l1.val + l2.val + carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            temp.next = new ListNode();
            temp = temp.next;
        }
        if (carry > 0) {
            temp.val = carry;
        }
        temp = result;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        if (temp.next.val == 0) {
            temp.next = null;
        }
        return result;
    }
}