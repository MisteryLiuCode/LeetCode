import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        val=this.val;
    }
    public ListNode(){}
    public ListNode(int val,ListNode next){
        val=this.val;
        next=this.next;
    }
    public static void main(String[] args) {
        ListNode myTest = new ListNode();
    }

    public ListNode reverseList(ListNode head) {
//        定义返回的头指针
        ListNode pre=null;
//        定义指针指向头指针
        ListNode cur=head;
//        反转之前要保存一下next
        ListNode next;
        while (cur!=null){
//            先把下一个指针保存一下
            next=cur.next;
//            是指pre指向当前这个节点
            cur.next=pre;
//            指针向前走
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
