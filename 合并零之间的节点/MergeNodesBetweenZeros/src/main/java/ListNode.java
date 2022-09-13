/**
 * @program: MergeNodesBetweenZeros
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-26 17:56
 **/


public class ListNode {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 0;

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

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode ans = res;
        ListNode cur = head;
//          从第二数开始遍历
        while (cur.next != null) {
            if (cur.val != 0) {
//                不等于0可以直接往后加
                res.val += cur.val;
            } else {
//                等于0了，就新创建一个空间，往后走
                res.next = new ListNode(0);
//                指针往后走一下
                res = res.next;
            }
            cur = cur.next;
        }
        return ans.next;
    }
}
