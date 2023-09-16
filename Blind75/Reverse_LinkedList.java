public class Reverse_LinkedList {

    // Definition for singly-linked list.
    public static class ListNode {
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

    

    public static ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode perv = null;

        while(curr != null){
            ListNode temp = curr.next ;
            curr.next = perv;
            
            perv = curr ;
            curr = temp ;
        }

        return perv;
    }
}
