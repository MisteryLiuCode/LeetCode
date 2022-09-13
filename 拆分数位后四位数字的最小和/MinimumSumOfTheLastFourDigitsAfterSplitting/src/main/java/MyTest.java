import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: MinimumSumOfTheLastFourDigitsAfterSplitting
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-14 11:17
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.minimumSum(4009));
    }

    public int minimumSum(int num) {
        int [] nums=new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=num%10;
            num=num/10;
        }
        Arrays.sort(nums);
        int a=0;
        int b=0;
//        赋值    i=0   n=1   i=2  n=0
        int n=1;
        for(int i=0;i<4;i=i+2){
             a+= (int) (nums[i]*Math.pow(10,n));
             b+=(int) (nums[i+1]*Math.pow(10,n));
             n--;
        }
        return a+b;
    }
}
