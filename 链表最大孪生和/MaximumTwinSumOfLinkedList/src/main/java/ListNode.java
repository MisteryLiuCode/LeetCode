import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: MaximumTwinSumOfLinkedList
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-23 19:47
 **/


public class ListNode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next= new ListNode(3);
        int i = ListNode.pairSum(listNode);
        System.out.println(i);
    }

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

    public static int pairSum(ListNode head) {
//       cur指向头指针
        ListNode cur=head;
//        保存反过来的数组
        ArrayList<Integer> integers = new ArrayList<>();
        while (cur != null) {
//             遍历把值添加进数组
            integers.add(cur.val);
            cur = cur.next;
        }
        int sum = 0;
//        遍历，保存较大的
        for (int i=integers.size()-1;i>=integers.size()/2;i--){
            if (sum<head.val+integers.get(i)){
                sum=head.val+integers.get(i);
            }
            head=head.next;
        }
            return sum;
    }
}
