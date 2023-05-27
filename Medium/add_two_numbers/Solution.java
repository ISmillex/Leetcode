class  ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}



public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1curr = l1;
        ListNode l2curr = l2;
        ListNode finalHead = new ListNode();

        int l1val = 0;
        int l2val = 0;
        int index = 0;


        while(l1curr != null) {
            l1val += l1curr.val * Math.pow(10, index);
            index++;
            l1curr = l1curr.next;
        }

        index = 0;
        while (l2curr != null) {
            l2val += l2curr.val * Math.pow(10, index);
            index++;
            l2curr = l2curr.next;
        }

        int resVal = l1val + l2val;
        
        System.out.println(resVal);

        ListNode newNode = finalHead;
        while (resVal != 0 ) {
            newNode.val = resVal%10;
            if (resVal > 9)
                newNode.next = new ListNode();
            newNode = newNode.next;
            resVal /= 10;
        }

        return finalHead;
    }


    public void print(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        ListNode l1node1 = new ListNode(2);
        // ListNode l1node2 = new ListNode(4);
        // ListNode l1node3 = new ListNode(3);
        // ListNode l1node4 = new ListNode();

        ListNode l2node1 = new ListNode(5);
        ListNode l2node2 = new ListNode(6);
        ListNode l2node3 = new ListNode(4);
        // ListNode l2node4 = new ListNode();
        // ListNode l2node5 = new ListNode();
        // ListNode l2node6 = new ListNode();

        l1 = l1node1;
        // l1node1.next = l1node2;
        // l1node2.next = l1node3;

        l2 = l2node1;
        l2node1.next = l2node2;
        l2node2.next = l2node3;

        Solution s = new Solution();

        s.print(l1);
        s.print(l2);

        s.print(s.addTwoNumbers(l1, l2));
    }
}