/**
 * @program: Seek1-n
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-16 17:21
 **/


public class MyTest {

//   递归写法
    public int sumNums(int n) {

        int sum = n;
        boolean flag = n > 0 && (sum += sumNums(n - 1)) > 0;
        return sum;
    }

}
