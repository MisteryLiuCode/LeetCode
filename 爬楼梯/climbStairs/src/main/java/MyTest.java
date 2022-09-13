import java.util.ArrayList;

/**
 * @program: climbStairs
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-19 21:11
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.climbStairs(4));
    }
//    public int climbStairs(int n) {
//       if(n==1){
//           return 1;
//       }
//       if (n==2){
//           return 2;
//       }
//       return climbStairs(n-1)+climbStairs(n-2);
//    }

    public int climbStairs(int n) {
//        用一个数组来保存计算出来的每一个数
        int [] arr = new int [n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <=n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }


}
