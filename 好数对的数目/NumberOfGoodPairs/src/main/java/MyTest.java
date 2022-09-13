import java.util.Arrays;

/**
 * @program: NumberOfGoodPairs
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-14 14:47
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2,3,1,1,3};
        System.out.println(myTest.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        if (nums.length<2){
            return 0;
        }
//        对数组进行排序
        Arrays.sort(nums);
//        设定两个指针
        int a=0;
        int b=1;
//        设定初始值count=1
        int count=1;
        int result=0;
        for (int i=0;i<nums.length-1;i++){
//            如果b超过了下标，则直接break
            if (b==nums.length){
                break;
            }
//            如果两个值相等，则让count++；
            if (nums[a]==nums[b]){
                count++;
            }
            else {
//                不相等，更新a到b的位置
                a=b;
//                计算一共的组合
                result+=count*(count-1)/2;
//                不相等了初始化count值
                count=1;
            }
//            不管等不等，都要使b++
            b++;
        }
//        跳出循环后，如果count还是不等于1，那说明中间没有不相等的，那么也就是所有值都相等的情况
        if (count!=1){
            result+=count*(count-1)/2;
        }
        return result;
    }
}
