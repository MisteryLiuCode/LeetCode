import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @program: HappyNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-14 21:40
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isHappy(100));

    }
//    快乐数的关键是会不会重复，如果出现重复还不为1，那么一定会成为死循环

    //    根据重复的特性，可以使用hashTable来判断加入集合中的数是不是重复的
    public Boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int s = 0;
        int flag = 0;
        //是否再次循环
        while (flag == 0) {
            int result = 0;
            //每次算出结果
            while (n != 0) {
                s = n % 10;
                n = n / 10;
                result += s * s;
            }
            //结果为1
            if (result == 1) {
                flag = 1;
            }
            //判断是否已经包括了，如果包括了，就是死循环
            if (set.contains(result)) {
                flag = 2;
            } else {
                set.add(result);
                n=result;
            }
        }
        return flag == 1 ? true : false;
    }

}
