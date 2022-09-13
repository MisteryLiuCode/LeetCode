/**
 * @program: AddUp
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-03 10:07
 **/


public class MyTest {

    public int addDigits(int num) {
        if (num/10==0){
            return num;
        }
        while (num/10!=0){
            int result=0;
            while (num/10!=0 || num%10!=0){
                result+=num%10;
                num=num/10;
            }
            num=result;
        }
        return num;
    }
}
