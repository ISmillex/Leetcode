public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        ListNode l1node1 = new ListNode(1);
        ListNode l1node2 = new ListNode(2);
        ListNode l1node4 = new ListNode(4);

        ListNode l2node1 = new ListNode(1);
        ListNode l2node3 = new ListNode(3);
        ListNode l2node4 = new ListNode(4);
        
        list1 = l1node1;
        l1node1.next = l1node2;
        l1node2.next = l1node4;

        list2 = l2node1;
        l2node1.next = l2node3;
        l2node3.next = l2node4;

        Solution s = new Solution();

        s.print(list1);
        s.print(list2);

        ListNode mergeList =  s.mergeTwoLists(list1, list2);
        s.print(mergeList);

    }
}
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeList = new ListNode();
        ListNode currentNode = mergeList;

        if (list1 == null) return list2;
        else if (list2 == null) return list1;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        if (list1 == null) currentNode.next = list2;
        else if (list2 == null) currentNode.next = list1;
        
        return mergeList.next;
    }



    public void print(ListNode list) {
        while(list != null) {
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");
    } 
}