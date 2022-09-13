import java.math.BigDecimal;

/**
 * @program: StringMultiplication
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-17 22:30
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.multiply("498828660196","840477629533"));
    }

    public String multiply(String num1, String num2) {
//        倒着遍历

//        定义两个数
        long resultA=0;
        long resultB=0;
        int n=0;
        for (int i=num1.length()-1;i>=0;i--){
            resultA+=Integer.parseInt(String.valueOf(num1.charAt(i)))*Math.pow(10,n);
            n++;
        }
        n=0;
        for (int i=num2.length()-1;i>=0;i--){
            resultB+=Long.parseLong(String.valueOf(num2.charAt(i)))*Math.pow(10,n);
            n++;
        }

        float result=resultA*resultB;
        return String.valueOf();
    }
}
