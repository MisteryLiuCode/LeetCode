import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] costs =new int[]{1,6,3,1,2,5};
        System.out.println(myTest.maxIceCream(costs, 20));
    }

    public int maxIceCream(int[] costs, int coins) {
//        对数组排序
        Arrays.sort(costs);
        int result=0;
//        对costs遍历
        for (int i = 0; i < costs.length; i++) {
            if (coins-costs[i]>=0){
                result++;
                coins=coins-costs[i];
            }
            else {
                break;
            }
        }
        return result;
    }


}