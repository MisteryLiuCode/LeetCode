import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,3,3};
        Solution solution = new Solution(nums);
        System.out.println(solution.pick(3));
    }

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    public Solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                list.add(i);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
    }

    public int pick(int target) {
        ArrayList<Integer> list = map.get(target);
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }


}
