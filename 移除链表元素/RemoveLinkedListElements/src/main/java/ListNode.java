/**
 * @program: RemoveLinkedListElements
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-16 10:47
 **/


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

class Solution {
    public ListNode removeElements(ListNode head, int val) {
//        创建一个节点，作为虚拟头结点
        ListNode listNode = new ListNode(-1);
//        这个节点指向真正的头结点
        listNode.next=head;
//        创建一个不动的节点，作为之后返回的头结点
        ListNode cur=listNode;
        while (listNode.next!=null){
            if (listNode.next.val==val){
                listNode.next=listNode.next.next;
            }
            else {
                listNode=listNode.next;
            }
        }
//        最后返回不动的节点,因为有一个虚拟的节点，所以返回cur.next
        return cur.next;
    }
}
