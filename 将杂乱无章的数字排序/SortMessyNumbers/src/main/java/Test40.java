/**
 * @program: SortMessyNumbers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-06 17:26
 **/

import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        int[] mapping = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] nums = {991, 338, 38};
//        int[] mapping = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] nums = {0, 999999999};
        new Test40().sortJumbled(mapping, nums);
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {

//        创建list
        List<A> list = new ArrayList<>();

//        对nums遍历
        for (int i = 0; i < nums.length; i++) {
//            获取每一个数组中的值
            int num = nums[i];
//            把得到的新的数字转换成int
            int mappingVal = Integer.parseInt(replaceData(num, mapping));

            A a = new A(i, num, mappingVal);

            list.add(a);
        }

        Collections.sort(list);

        int[] res = new int[nums.length];
        int index = 0;
        for (A a : list) {
            res[index++] = a.val;
        }

        return res;
    }
//    输入数字和数组
    public String replaceData(int num, int[] mapping) {
//        创建一个StringBuilder
        StringBuilder sb = new StringBuilder();
//        如果输入替换的0
        if (num == 0) {
//            如果原本就等于0，那么直接拼接
            return mapping[0] + "";
        }
        while (num != 0) {
            int mod = num % 10;
            sb.append(mapping[mod]);
            num = num / 10;
        }
//        把拼接的字符串翻转即是新的数字的字符串
        return sb.reverse().toString();
    }
}

class A implements Comparable<A> {

    int id;
    int val;
    int mappingVal;

    public A(int id, int val, int mappingVal) {
        this.id = id;
        this.val = val;
        this.mappingVal = mappingVal;
    }


    @Override
    public int compareTo(A o) {
        if (this.mappingVal != o.mappingVal) {
            return this.mappingVal-o.mappingVal;
        } else {
            return this.id-o.id;
        }
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", val=" + val +
                ", mappingVal=" + mappingVal +
                '}';
    }
}
