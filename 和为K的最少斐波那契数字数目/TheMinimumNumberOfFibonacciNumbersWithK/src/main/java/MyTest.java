/**
 * @program: TheMinimumNumberOfFibonacciNumbersWithK
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-03 13:30
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.findMinFibonacciNumbers(6));
    }

    public int findMinFibonacciNumbers(int k) {
        int result=0;
        int befor=1;
        int behind=1;
        while (k!=0) {
//            重置
            befor=1;
            behind=1;
            while (behind <=k) {
//                更新位置，都往后走一位
                behind = befor + behind;
                befor = behind-befor;
            }
//            跳出说明有一个数
            result++;
            k-=befor;
        }
        return result;
    }
}
