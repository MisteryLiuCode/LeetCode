import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length==1){
            return list;
        }
        else if (nums.length==2 && nums[0]==nums[1]){
            list.add(nums[0]);
            return list;
        }
        else {
           for (int i=0;i<nums.length-1;i++){
               if (nums[i]==nums[i+1]){
                   list.add(nums[i]);
               }
           }
        }
        return list;
    }


}
