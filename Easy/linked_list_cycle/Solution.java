import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

public class Solution {

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode currNode = head;

        while (currNode != null) {
            if (!set.contains(currNode)) set.add(currNode);
            else if (set.contains(currNode)) {
                return true;
            }
            currNode = currNode.next;
        }

        return false;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(3);

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        Solution s = new Solution();
        System.out.println(s.hasCycle(head));

    }
}