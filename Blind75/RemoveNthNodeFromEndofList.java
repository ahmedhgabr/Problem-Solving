
public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        if (len == 1) {
            return null;
        }

        if (len == n) {
            return head.next;
        }

        curr = head;

        for (int i = 0; i < len - n - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
