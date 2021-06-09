class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode count = head;
        int size = 0;
        while (count != null) {
            size++;
            count = count.next;
        }
        if (n == size) {
            return head.next;
        }
        int index = 0;
        while (index <= size - 2 - n) {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
        return head;
    }
}