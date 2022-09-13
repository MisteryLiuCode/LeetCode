import java.util.ArrayList;
import java.util.List;

/**
 * @program: YangHuiTriangle
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-30 19:31
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        List<List<Integer>> generate = myTest.generate(5);
        System.out.printf(String.valueOf(generate));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

//        前两个数是没有规律的，直接手动加上
        if (numRows>=1){
//            创建一个list对象
            ArrayList<Integer> integers = new ArrayList<>();
//            添加上
            integers.add(1);
            list.add(0, integers);
        }
        if (numRows>=2){
//            如果第二行，把两个1添加进去
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(1);
            list.add(1, integers);
        }

        if (numRows>=3){
//            第一个循环代表是添加的第几个
            for (int i = 2; i < numRows; i++) {
//                每次创建一个新的List
                ArrayList<Integer> integers = new ArrayList<>();
//                每次在开头把添加一个1
                integers.add(1);

//                每次添加的数是前两个数之和，次数是i-1。
                for (int j = 0; j < i - 1; j++) {
                    integers.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
                }
//                最后添加1
                integers.add(1);
                list.add(integers);
            }
        }
        return list;
    }
}
