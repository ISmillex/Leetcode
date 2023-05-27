import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {
            if (!set.contains(currA)) set.add(currA);
            currA = currA.next;
        }

        while(currB != null) {
            if (set.contains(currB))
                return currB;
            currB = currB.next;
        }

        return null;
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
        IntersectionOfTwoLinkedLists i = new IntersectionOfTwoLinkedLists();

        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);

        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(8); 
        ListNode nodeA3 = new ListNode(4); 
        ListNode nodeA4 = new ListNode(5);  


        ListNode nodeB1 = new ListNode(6); 
        ListNode nodeB2 = new ListNode(1); 

        
        headA.next = nodeA1;
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;

        headB.next = nodeB1;
        nodeB1.next = nodeB2;
        nodeB2.next = nodeA2;

        i.print(headA);
        i.print(headB);

        System.out.println(i.getIntersectionNode(headA, headB));
    }
}