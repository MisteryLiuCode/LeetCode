import java.util.ArrayList;

/**
 * @program: IntegerInversion
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-06 20:16
 **/

//已完成
public class MySlove {
    public static void main(String[] args) {
        Integer mytest = Mytest(153429);
        System.out.println(mytest);
    }

    public static Integer Mytest(int n) {
//        拆分出一个数的所有位
//        定义一个数组，里面存储倒叙的数字
        ArrayList<Integer> integers = new ArrayList<>();
        while (n != 0) {
            integers.add(n % 10);
            n = n / 10;
        }
//        看评论这个long类型好像犯规了
        long result = 0;
        int j = integers.size();
        for (int i = 0; i < integers.size(); i++) {
            j--;
            result += integers.get(i) * Math.pow(10, j);
        }
//        如果能转就转，不能转就设置为0
            return (int)result==result? (int)result:0;
    }
}
