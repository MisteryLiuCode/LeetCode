import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{3,3};
//        [1, 2, 2, 3, 3, 4, 7, 8]
        System.out.println(myTest.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=0;
//        对数组排序
        Arrays.sort(nums);
//        遍历计算相邻两个数的差，如果差值大于1，则把值插进去
        for (int i = 0; i < nums.length-1; i++) {
             n=nums[i+1]-nums[i];
            if(n>1){
                for (int j=1;j<n;j++){
                    list.add(nums[i]+j);
                }
            }
        }
//        如果第一个数不等于1，说明最前面少了一些数
        if (nums[0]!=1){
            n=nums[0]-1;
//            倒着循环，把数字插入进去
            for (int j=n;j>=1;j--){
                list.add(nums[0]-j);
            }
        }
//        如果最后一个数不等于数组的长度，则说明后面少了数，遍历插入进去
        if (nums[nums.length-1]!=nums.length){
            n=nums.length-nums[nums.length-1];
            for (int j=1;j<=n;j++){
                list.add(nums[nums.length-1]+j);
            }
        }
        return list;
    }
}