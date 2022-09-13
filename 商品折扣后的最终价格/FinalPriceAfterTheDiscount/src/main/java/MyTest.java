import java.util.Arrays;

/**
 * @ClassName MyTest
 * @Description
 * @Author 刘帅彪
 * @Date2022/7/10 20:55
 **/
public class MyTest {
    public static void main(String[] args) {
//        int[] price=new int[]{8,4,6,2,3};
        int[] price=new int[]{10,1,1,6};
        MyTest myTest = new MyTest();
        int[] ints = myTest.finalPrices(price);
        System.out.println(Arrays.toString(ints));
    }


    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            Boolean flag = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    res[i] = prices[i] - prices[j];
                    flag = true;
                    break;
                }
            }
            if (flag==false){
                res[i]=prices[i];
            }
        }
        return res;
    }
}
