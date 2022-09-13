/**
 * @program: Sqrt
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-26 14:16
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.mySqrt(0));
    }

    public int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        int begin=1;
        int end=x;
        int result=0;
        while (begin+1<end){
            result=(begin+end)/2;
//           本来是result*result<=x, 这里防止溢出，所以使用除法
            if (x/result>=result){
                begin=result;
            }
            if (x/result<result){
                end=result;
            }

        }
        return begin;
    }
}
