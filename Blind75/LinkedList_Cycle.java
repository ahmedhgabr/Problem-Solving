import java.util.HashSet;

public class LinkedList_Cycle {
    

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

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while(head != null){
            if(set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }
}
