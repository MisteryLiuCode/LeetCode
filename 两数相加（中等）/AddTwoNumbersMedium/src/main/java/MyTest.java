/**
 * @program: AddTwoNumbersMedium
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-15 16:35
 **/


public class MyTest {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        l1 = new ListNode(4,l1);
        l1 = new ListNode(2,l1);
        ListNode l2 = new ListNode(5);
        l2 = new ListNode(6,l2);
        l2 = new ListNode(5,l2);
        System.out.print(l1.val);
        System.out.print(l1.next.val);
        System.out.println(l1.next.next.val);
        System.out.println("-----------------");
        System.out.print(l2.val);
        System.out.print(l2.next.val);
        System.out.println(l2.next.next.val);
        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println("-----------------");
        System.out.print(l3.val);
        System.out.print(l3.next.val);
        System.out.println(l3.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        创建链表的开头
        ListNode result=new ListNode(0);
//        创建用来连接的链表和移动的节点
        ListNode move=result;
//        进位
        int carry=0;
//        存储每一次计算的结果
        int sum=0;
//        对输入的链表进行循环，条件为两个链表任一为空时结束循环
        while (l1!=null || l2!=null){
//            有一个链表为空，就让值设置为0
            int l1Val=l1!=null?l1.val:0;
            int l2Val=l2!=null?l2.val:0;

            sum=carry+l1Val+l2Val;
            carry=sum/10;


            move.next=new ListNode(sum%10);
//            指针后移
            move=move.next;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
//        进位是否为1
        if (carry>0){
            move.next=new ListNode(carry);
        }
        return result.next;
    }
}

class ListNode {
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
