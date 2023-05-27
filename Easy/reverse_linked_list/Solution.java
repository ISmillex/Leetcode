class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}


public class Solution {

    public ListNode reverseListIterative(ListNode head) {

        ListNode curNode = head;
        ListNode prev = null;
        ListNode next = null;

        while (curNode != null) {
            next = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = next;
        }
        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        return head;
    }


    public void print(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode head = new ListNode();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        s.print(head);
        s.print(s.reverseListIterative(head));
    }
}