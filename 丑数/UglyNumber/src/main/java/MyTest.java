/**
 * @program: UglyNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-04 12:15
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isUgly(-6));

    }

    public boolean isUgly(int n) {
        if (n<=0){
            return false;
        }

//        对n进行循环
        while (n!=1){
            if (n%2==0){
                n=n/2;
            }
            else if (n%3==0){
                n=n/3;
            }
            else if (n%5==0){
                n=n/5;
            }
            else {
                return false;
            }
        }
        return true;
    }

}
