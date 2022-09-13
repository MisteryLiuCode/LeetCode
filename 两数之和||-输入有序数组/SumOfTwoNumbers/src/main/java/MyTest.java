import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @program: SumOfTwoNumbers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-13 21:07
 **/


public class MyTest {
    public static void main(String[] args) {
        int[] numbers=new int[]{2,7,11,15};
        int target=9;
        int[] ints = MyTest.twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] twoSum(int[] numbers, int target) {
//        for循环，第一个参数是i的初始值，第二个参数是最后一个值，循环的条件是i<j
        for (int i = 0, j = numbers.length - 1; i < j;) {
//            每次循环，就把两个数加起来
            int sum = numbers[i] + numbers[j];
//            如果等于target就返回
            if (sum == target){
                 return new int[]{i + 1, j + 1};
            }
//            因为数组是递增的，如果加起来大于了，就把最后的指针向前移动，数字变小
            else if(sum > target) {
                 j--;
            }
//            否则就让前面的指针向后移动，数字增大
            else{
                i++;
            }
        }
        return null;
    }
}
