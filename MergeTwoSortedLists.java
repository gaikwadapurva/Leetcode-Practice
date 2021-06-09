class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if ((l1 == null && l2 == null) || (l1 != null && l2 == null)) {
            return l1;
        }
        else if (l1 == null && l2 != null) {
            return l2;
        }
        else {
            ListNode result = new ListNode();
            ListNode temp = result;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    temp.val = l1.val;
                    l1 = l1.next;
                }
                else {
                    temp.val = l2.val;
                    l2 = l2.next;
                }
                temp.next = new ListNode();
                temp = temp.next;
            }
            while (l1 != null) {
                temp.val = l1.val;
                l1 = l1.next;
                if (l1 != null) {
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }
            while (l2 != null) {
                temp.val = l2.val;
                l2 = l2.next;
                if (l2 != null) {
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }
            return result;
        }
    }
}