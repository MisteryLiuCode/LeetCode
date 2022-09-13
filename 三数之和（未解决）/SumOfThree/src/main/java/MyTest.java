import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: SumOfThree
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-18 18:13
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] test = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        myTest.threeSum(test);
//        System.out.println(myTest.threeSum(test));
    }

    public List<List<Integer>> threeSum(int[] nums) {

//        去除两个最小值之和最大值
        ArrayList<Integer> integers = new ArrayList<>();
//        保存结果
        List<List<Integer>> result = new ArrayList<>();
//        排序
        Arrays.sort(nums);
//        去除太大的数
        if (nums.length>2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > Math.abs(nums[0] + nums[1])) {
                    break;
                } else {
                    integers.add(nums[i]);
                }
            }
        }
//        如果不够三个数直接返回空
        else {
            return result;
        }
//        此时intergers是截取后的
//        设置三个指针
        int left = 0;
        int mvoe = 0;
        int right = 0;

//        用于去重的时候
        int flag=0;
        int target=0;
//        遍历取出每一个值
        for (int i = 0; i < integers.size(); i++) {
//            每次去除一个值
            ArrayList<Integer> copy = (ArrayList<Integer>) integers.clone();
            mvoe = copy.get(i);
            copy.remove(i);
            left = 0;
            right = copy.size()- 1;
            while (left < right) {
                if ((copy.get(left) + copy.get(right) + mvoe) == 0) {
                    //        去重，那每一个数比较，如果是第一个数存进来不用比较
                    if (result.size()>0) {
//                        对此时结果数组遍历
                        for (int j = 0; j < result.size(); j++) {
//                            每次重新选下一个结果中的数组的时候把flag置为0
                            flag = 0;
//                            取出此时算出的新结果
                            for (int k1 = 0; k1 < 3; k1++) {
                                if (k1 == 0) {
                                    target = copy.get(left);
                                }
                                if (k1 == 1) {
                                    target = copy.get(right);
                                }
                                if (k1 == 2) {
                                    target = mvoe;
                                }
//                                取出此时对比的结果集中的每一个数，如果相等则++；
                                for (int k = 0; k < 3; k++) {
                                    if (result.get(j).get(k).equals(target)) {
                                        flag++;
                                    }
                                }
                            }
//                            如果比较大于2了，那么就直接break
                            if (flag > 2) {
                                break;
                            }
                        }
//                        外层循环也brek;
                        if (flag > 2) {
                            break;
                        }
                    }
                    List<Integer> oneResult = new ArrayList<>();
                    oneResult.add(copy.get(left));
                    oneResult.add(copy.get(right));
                    oneResult.add(mvoe);
                    result.add(oneResult);
//                    System.out.println(oneResult);
                        left++;
                        right--;
                }
//                如果算出的数字偏小，小于0了，那么就增大数字，使左指针向右移动
                else if (copy.get(left) + copy.get(right) + mvoe < 0) {
                    left++;
                }
//                否则向左移动
                else if (copy.get(left) + copy.get(right) + mvoe > 0) {
                    right--;
                }
            }
        }
        return result;
    }
}
