import java.util.ArrayList;

/**
 * @program: romanNumberToInteger
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-12 17:13
 **/


public class MySolve {
    public static void main(String[] args) {
        MySolve mySolve = new MySolve();
        System.out.println(mySolve.mytest("MCMXCIV"));
    }

    public Integer mytest(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 0;
        int result = 0;
//        把字符串转为数组类型，方便遍历，toCharArray()可以直接转换为数组类型
        char[] chars = s.toCharArray();
//        对数组进行遍历，但是要倒着遍历，罗马数字在有时候两位罗马数字代表一位整数
        for (int i = 0; i < chars.length; i++) {
//            对于每一个数要进行一个转换
            switch (chars[i]) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
//            每次转换完需要进行比较它的上一个数字和它自身的比较
//            如果上一个数字比它自身要大，比如VI：那就是两个数字的组合5+1=6
//            如果它的上一个数字比它自身要小，比如IV：那结果就是5-1=4;
            nums.add(num);
        }
//        全部转换完之后，然后进行遍历对比
        for (int i = nums.size() - 1; i >= 0; i = i - 1) {
//            两个数之间进行对比
            if (i!=0) {
                if (nums.get(i) > nums.get(i - 1)) {
                    result += nums.get(i) - nums.get(i - 1) * 2;
                } else {
                    result += nums.get(i);
                }
            }
        }
//        加上第一个数
            result=result+nums.get(0);
        return result;
    }
}
