import java.util.Stack;

/**
 * @program: IntegerToRomanNumeral
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-26 18:33
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.intToRoman(1994));
    }

    public String intToRoman(int num) {
//        栈存储拆开的数
        int[] numbers=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romeCharacter=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//
        String result="";
        for (int i = 0; i < numbers.length; i++) {
//            如果numbers[i]<=num，说明到了要拼接的临界点。
            while (numbers[i]<=num){
//                拼接一个从原数中减去，继续拼接下面的数
                num-=numbers[i];
                result+=romeCharacter[i];
            }
        }
        return result;
    }
}
