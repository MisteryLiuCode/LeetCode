/**
 * @program: TakeACoin
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-28 15:42
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] coins=new int[]{2,3,10};
        System.out.println(myTest.minCount(coins));
    }
    public int minCount(int[] coins) {
        int result=0;
        for (int i = 0; i < coins.length; i++) {
            result+=coins[i]%2;
            result+=coins[i]/2;
        }
        return result;
    }
}
