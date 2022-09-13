/**
 * @program: ArrangeCoins
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-13 14:07
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.arrangeCoins(5));
    }

    public int arrangeCoins(int n) {
        int result=0;
        int m=1;
        while (n>=0){
            result++;
            n=n-m;
            m++;
        }
        return result-1;
    }
}
