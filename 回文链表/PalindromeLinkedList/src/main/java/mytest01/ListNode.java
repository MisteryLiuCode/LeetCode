package mytest01;

/**
 * @program: PalindromeLinkedList
 * @description:
 * @author: 刘帅彪
 * @create: 2022-04-08 17:07
 **/


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public boolean isPalindrome(ListNode head) {
//        保存头结点
        ListNode cloneHead=head;
        String s1 = sumListNode(head);
        ListNode cur=cloneHead;
        ListNode pre=null;
        ListNode next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        String s2 = sumListNode(pre);
        if (s1.equals(s2)){
            return true;
        }
        return false;
    }

    public String sumListNode(ListNode head){
        String res="";
        while (head!=null){
            res+=head.val;
            head=head.next;
        }
        return res;
    }
}
