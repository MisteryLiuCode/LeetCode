public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    
    public void deleteNode(ListNode node) {
//        将这个节点变为下一个节点
        node.val=node.next.val;
//        将这个节点指向next.next
        node.next=node.next.next;

    }
}


