import java.util.ArrayList;
import java.util.List;

/**
 * @program: YanghuiTriangleII
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-01 14:22
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.getRow(4));
    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> previous = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
//        如果rowIndex=0或者rowIndex=1直接返回
        previous.add(1);
        if (rowIndex == 0) {
            return previous;
        }
        previous.add(1);
        if (rowIndex==1){
            return previous;
        }
//        rowIndex此时大于一
        for (int i = 1; i < rowIndex; i++) {
//            每次在开头添加1
            result.add(1);
//            对中间的数进行计算
            for (int j = 0; j < previous.size()-1;j++) {
//                填充中间值
                result.add(previous.get(j)+previous.get(j+1));
            }
//            添加末尾的值
            result.add(1);
//            如果已经遍历到最后一个了，那就直接返回
            if (i==rowIndex-1){
                return result;
            }
            else {
//                否则的话把这个数组复制为上一个数组
                previous= (ArrayList<Integer>) result.clone();
//                清空result重新遍历
                result.clear();
            }
        }
        return result;
    }

}
