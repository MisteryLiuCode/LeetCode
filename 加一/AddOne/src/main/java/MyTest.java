/**
 * @program: AddOne
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-19 23:49
 **/


public class MyTest {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
//        倒着排序
        for (int i = digits.length - 1; i >= 0; i--) {
//            这是重点，倒着判断每一位是否是9，如果不等于9，那么就让最后一个加1，
//            然后就返回了，就return，就结束了。这中间也许会有一个是9，
//            但如果不是进位的那么就遍历不到那一位。
//            如果每一次都遍历不到这个if语句里，说明这一位为9，
//            那么久让这一位置为0，如果最后跳出循环，那就说明每一位都为0，
//            没有进入if语句，那么就让总体增加一位，第一个变为1；
//            这种解法简直太简洁太妙了!
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
