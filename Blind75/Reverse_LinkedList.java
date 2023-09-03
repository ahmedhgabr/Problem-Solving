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

    public static void main(String[] args) {
        ListNode[] list = new ListNode[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ListNode();
            list[i].val = i;
            if (i < list.length - 1)
                list[i].next = list[i + 1];
        }
        ListNode a = reverseList(list[0]);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
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
