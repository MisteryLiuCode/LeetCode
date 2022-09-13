package leetCode;

/**
 * @program: SingleLinkedList
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-29 11:34
 **/


public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        创建一个List对象
        ListNode res=new ListNode();
//      res的引用指向的cur
        ListNode cur=res;
//        一直遍历到其中一个链表为null
        while (list1!=null && list2!=null) {

//            如果list1小于等于list2
            if (list1.val <= list2.val) {
//                让创建的指针对象指向list1
                cur.next=list1;
//                此时list1已经比list2小了，所以就把list1右移，此时list2指针不变
                list1=list1.next;
            }
            else {
//                否则说明list2大于list1的值
//                此时就让指针的next指向list2，这时候list1指针不动
                cur.next=list2;
//                list2的指针右移，list1不动
                list2=list2.next;
            }
//            最后让cur等于cur的next，注意，此时cur只是代表一个对象了，没有和其他进行连接
//            而方法开头的 ListNode cur=res;来记录这个指向的过程
            cur=cur.next;
        }
//        当循环跳出的时候，代表已经有一个为null，哪个为null,直接把指针指向后面的就行了
//        因为这两个链表本来就是有序链表。
        if (list1 ==null){
            cur.next=list2;
        }
        if (list2==null){
            cur.next=list1;
        }

//        最后返回保存整个过程的res.next。
//        为什么是res.next呢，因为res最开始赋值的时候是空的指向，cur最开始赋值的时候
//        就是cur的next。
        return res.next;
    }
}
