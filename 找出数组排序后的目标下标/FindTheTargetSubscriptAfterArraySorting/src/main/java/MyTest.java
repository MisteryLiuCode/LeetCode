import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {

    public List<Integer> targetIndices(int[] nums, int target) {
//        对数组排序
        Arrays.sort(nums);
        List<Integer> result= new ArrayList<>();
        int falg=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                falg=1;
                result.add(i);
            }
            if (falg==1 && nums[i]!=target){
                break;
            }
        }
        return result;
    }

}
