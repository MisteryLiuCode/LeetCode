/**
 * @program: PalindromeLinkedList
 * @description:
 * @author: 刘帅彪
 * @create: 2022-04-08 16:25
 **/


public class ListNode {
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){
        val=this.val;
    }
    public ListNode(int val,ListNode next){
        next=this.next;
    }
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
        for (int i=0;i<s1.length();i++){
            if (!String.valueOf(s1.charAt(i)).equals(String.valueOf(pre.val))){
                return false;
            }
            pre=pre.next;
        }
        return true;
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
