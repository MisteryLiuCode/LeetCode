import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] aliceSizes = new int[]{1,2,5};
        int[] bobSizes = new int[]{2, 4};
        System.out.println(Arrays.toString(myTest.fairCandySwap(aliceSizes, bobSizes)));
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] res = new int[2];
//        计算两个糖果数量
        int sum1 = 0;
        for (int aliceSize : aliceSizes) {
            sum1 += aliceSize;
        }
        int sum2 = 0;
        for (int bobSize : bobSizes) {
            sum2 += bobSize;
        }
//        计算差值
        int difference = 0;
        if (sum2 > sum1) {
            difference = sum2 - sum1;
            int[] resReverse=cacal(aliceSizes, bobSizes, difference);
            res[0]=resReverse[1];
            res[1]=resReverse[0];
            return res;
        } else if (sum1 > sum2) {
            difference = sum1 - sum2;
            return cacal(bobSizes,aliceSizes, difference);
        }
        return res;
    }

    public int[] cacal(int[] num1, int[] num2, int difference) {
        int[] res = new int[2];
        outr:
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                if (num2[i] - num1[j] == difference / 2) {
                    res[0] = num2[i];
                    res[1] = num1[j];
                    break outr;
                }
            }
        }
        return res;
    }

}
