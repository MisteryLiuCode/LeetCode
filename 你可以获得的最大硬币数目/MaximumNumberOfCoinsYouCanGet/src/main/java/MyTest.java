import java.util.Arrays;
import java.util.Collections;

/**
 * @program: MaximumNumberOfCoinsYouCanGet
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-14 14:13
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] piles=new int[]{9,8,7,6,5,1,2,3,4};
        System.out.println(myTest.maxCoins(piles));
    }

    public int maxCoins(int[] piles) {
//        对3取余
        int n= piles.length/3;
        int count=0;
        int result=0;
        Arrays.sort(piles);
        for (int i=piles.length-2;i>=0;i=i-2){
            count++;
            result+=piles[i];
            if (count==n){
                return result;
            }
        }
        return result;
    }

}
