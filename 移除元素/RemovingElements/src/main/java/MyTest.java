import java.util.Arrays;

/**
 * @program: RemovingElements
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-28 17:15
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,3};
        int val=3;
        System.out.println(myTest.removeElement(nums, val));
    }
    public int removeElement(int[] nums, int val) {
//        思路：设置两个指针，一个放在开头，一个放在结尾
//        开始进行遍历，左边的指针开始走
//        如果遇到和val值相等的元素，那么就停止遍历，看右指针
//        如果右指针遇到一个和val值相等的元素，那么这个时候与左指针进行交换值
        int left=0;
        int right=nums.length-1;
            for (int i = 0; i < nums.length; i++) {
                while (nums[left] != val && left < right) {
                    left++;
                }
                while (nums[right] == val && left < right) {
                    right--;
                }
                if (left==right && nums[left]!=val){
                    left++;
                    break;
                }
                    int middle = nums[right];
                    nums[right] = nums[left];
                    nums[left] = middle;
            }

        return left;
    }


}
