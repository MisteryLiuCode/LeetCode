import java.util.ArrayList;

/**
 * @program: PalindromeNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-11 17:10
 **/


public class MySolve {
    public static void main(String[] args) {
        MySolve mySolve = new MySolve();
        Boolean aBoolean = mySolve.palindromeNumber(2147483647);
        System.out.println(aBoolean);
    }


    public Boolean palindromeNumber(int x) {
        int begin=x;
        if (x < 0) {
            return false;
        } else {
//        拆分出一个数的所有位
//        定义一个数组，里面存储倒叙的数字
            ArrayList<Integer> integers = new ArrayList<>();
            while (x != 0) {
                integers.add(x % 10);
                x = x / 10;
            }
//        看评论这个long类型好像犯规了
            long result = 0;
            int j = integers.size();
            for (int i = 0; i < integers.size(); i++) {
                j--;
                result += integers.get(i) * Math.pow(10, j);
            }
//        如果能转就转，不能转就设置为0
            if ( result==begin) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
