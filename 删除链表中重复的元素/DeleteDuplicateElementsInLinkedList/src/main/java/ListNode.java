/**
 * @program: DeleteDuplicateElementsInLinkedList
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-07 17:06
 **/


public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode deleteDuplicates(ListNode head) {
//        创建一个新的指针指向头结点，目的是用这个节点进行操作
        ListNode cur=head;
        while (cur != null && cur.next!=null) {
            if (cur.val == cur.next.val) {
//                如果相等，那么就删除下一个节点，是指针指向下一个的下一个
//                注意此时，cur的指向还是不变，如果是第一次循环的话，那么cur指向的还是第一个节点
//
                cur.next = cur.next.next;
            } else {
//                如果不相等，那么就把cur指针往后移动
                cur = cur.next;
            }
        }
//        最后通过cur已经把节点的顺序排好了，最后返回一直指向头结点的head。
        return head;
    }
}
