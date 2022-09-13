/**
 * @program: AddUp
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-29 17:14
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.addDigits(8));
    }
    public int addDigits(int num) {
//        小于10直接返回
        if (num<10){
            return num;
        }
        int result=0;
        while (num/10!=0){
//            每次重新计算，重置result
            result=0;
//            num/10!=0，会少算一次，比如38的3也需要加上，而num%10!=0可以避免这个问题
            while (num/10!=0 || num%10!=0){
                result+=num%10;
                num=num/10;
            }
//            重置num的值
            num=result;
        }
        return result;
    }
}
