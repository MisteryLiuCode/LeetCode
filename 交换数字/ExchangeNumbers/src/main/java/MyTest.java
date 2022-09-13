import java.util.Arrays;

/**
 * @program: ExchangeNumbers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-25 16:00
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] numbers=new int[]{1,2};
        int[] ints = myTest.swapNumbers(numbers);
        System.out.println(Arrays.toString(ints));
    }
    public int[] swapNumbers(int[] numbers) {
         numbers[0]=numbers[0]-numbers[1];
         numbers[1]=numbers[1]+numbers[0];
         numbers[0]=numbers[1]-numbers[0];
         return numbers;
    }
}
