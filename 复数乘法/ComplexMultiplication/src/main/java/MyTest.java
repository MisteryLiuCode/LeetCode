/**
 * @program: ComplexMultiplication
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-25 10:25
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.complexNumberMultiply("1+-1i", "0+0i"));
    }

    public String complexNumberMultiply(String num1, String num2) {
//        使用正则表达式对这两个数进行分割
        String[] complex1 = num1.split("\\+|i");
        String[] complex2 = num2.split("\\+|i");
//        此时已经把实部和虚部分开了 对于这个字符串数组，0是实部，1是虚部

//        实部和实部相乘
        int realPart= new Integer(String.valueOf(complex1[0]))* new Integer(String.valueOf(complex2[0]));
//        虚部和虚部相乘
        int illusoryPart=new Integer(String.valueOf(complex1[1]))* new Integer(String.valueOf(complex2[1]))*-1;

//        结果实部
        int resultReal=realPart+illusoryPart;

//        虚部
        int resultIllusoryPart=new Integer(String.valueOf(complex1[0]))* new Integer(String.valueOf(complex2[1]))+new Integer(String.valueOf(complex1[1]))* new Integer(String.valueOf(complex2[0]));

//        结果
        String result=String.valueOf(resultReal)+"+"+String.valueOf(resultIllusoryPart)+"i";
        return result;
    }

}
