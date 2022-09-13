import java.util.ArrayList;

/**
 * @description:
 * @author: 刘帅彪
 * @create: 2022-04-19 21:41
 **/


public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
//        遍历，大的放进list，小的放进list1
        while (head != null) {
            if (head.val >= x) {
                list2.add(head.val);
            } else {
                list1.add(head.val);
            }
            head = head.next;
        }
//        合并
        res.addAll(list1);
        res.addAll(list2);
//        转化为链表
        ListNode sentineNode = new ListNode(0);  //建立哨兵节点
        ListNode tempNode = sentineNode;  //tempNode变量指向哨兵节点
        for (int i = 0; i < res.size(); i++) {
            ListNode newNode = new ListNode(res.get(i));
            tempNode.next = newNode;    //临时节点‘后继指针’指向新节点
            tempNode = newNode;        //把新节点赋给临时变量tempNode
        }
        return sentineNode.next;
    }
}
