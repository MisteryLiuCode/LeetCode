/**
 * @program: SortMessyNumbers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-06 18:21
 **/

public class Test39 {

    public static void main(String[] args) {
        Test39 test39 = new Test39();
        // [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
        //[0,1,2,3,4,5,6,7,8,9]
        //[0,999999999]
//        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
//        int[] nums = {991,338,38};
        int[] mapping = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums = {0, 999999999};
//
        // System.out.println(Integer.parseInt(new StringBuilder().append(0).append(1).toString()));
        for (int i : test39.sortJumbled(mapping, nums)) {
            System.out.println(i);
        }
        Node node0 = new Node(null, -1, -1, null);


    }


    public int[] sortJumbled(int[] mapping, int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int mappingVal = Integer.parseInt(replaceData(num,mapping));

            Node n = new Node(null, num, mappingVal, null);
            push(n);
        }


        int[] res = new int[nums.length];
        int index = 0;
        while (head != null) {
            res[index++] = head.val;
            head = head.next;
        }

        return res;
    }

    public String replaceData(int num,int[] mapping){

        StringBuilder sb = new StringBuilder();
        if(num == 0){
            return mapping[0]+"";
        }
        while (num!=0) {
            int mod = num % 10;
            sb.append(mapping[mod]);
            num = num / 10;
        }

        return sb.reverse().toString();
    }

    Node head;
    Node preHead;

    public void push(Node node) {

        Node temp = head;

        /**
         * 1、temp为空，还没初始化
         * 2、查找要插入的位置
         *      2.1 找到位置 链表尾
         *      2.2 链表头
         *      2.3 中间
         */
        if (temp == null) // 1、temp为空，还没初始化
            temp = node;
        else { // 2、查找要插入的位置
            Node n = findNode(node);
            if (n == null) { // 链表尾
                preHead.next = node;
                node.pre = preHead;
            } else if (temp == n) { // 链表头
                node.next = n;
                n.pre = node;
            } else {
                // 中间
                node.pre = n.pre;
                n.pre.next = node;
                node.next = n;
                n.pre = node;

                temp = n;
            }


            while (temp.pre != null) {
                temp = temp.pre;
            }

        }
        head = temp;

    }

    /**
     * 查找位置
     *
     * @param node
     * @return 1、temp=null 插入尾部
     * 2、不为空 返回当前节点
     */
    public Node findNode(Node node) {
        // 链表不为空
        Node temp = head;
        while (temp != null) {
            if (node.mappingVal >= temp.mappingVal) {
                preHead = temp;
                temp = temp.next;
            } else {
                break;
            }
        }

        return temp;
    }

}

class Node {

    int val;
    int mappingVal;
    Node next;
    Node pre;

    public Node(Node pre, int val, int mappingVal, Node next) {

        this.val = val;
        this.mappingVal = mappingVal;
        this.pre = pre;
        this.next = next;
    }
}

