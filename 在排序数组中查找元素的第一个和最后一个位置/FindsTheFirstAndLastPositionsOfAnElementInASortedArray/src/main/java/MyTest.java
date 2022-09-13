import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(myTest.searchRange(nums, 6)));
    }

    public int[] searchRange(int[] nums, int target) {
//        用来记录等于target的左边
        int beg = 0;
//        记录右边
        int end = 0;
//        记录结果
        int[] res = new int[]{-1, -1};
//        初始化左指针和右指针
        int left = 0;
        int right = nums.length - 1;
//        当左指针小于等于右指针的时候
        while (left <= right) {
//            二分法求中间值
            int mid = left + (right - left) / 2;

//            如果太大，就让right左移
            if (nums[mid] > target) {
                right--;
//                如果太小就让left右移
            } else if (nums[mid] < target) {
                left++;
//                如果相等
            } else if (nums[mid] == target) {
//                初始化两个边界位置
                beg = mid;
                end = mid;
                for (int i = 1; i < nums.length; i++) {
//                    同时从mid开始往左走和往右走
                    int l = mid - i;
                    int r = mid + i;
//                    如果在数组中并且等于target更新beg的位置
                    if (l >= 0 && nums[l] == target) {
                        beg = l;
                    }
//                    同理
                    if (r < nums.length && nums[r] == target) {
                        end = r;
                    }
                }
//                最后放入值
                res[0] = beg;
                res[1] = end;
                break;
            }
        }
//        返回res
        return res;
    }


}
