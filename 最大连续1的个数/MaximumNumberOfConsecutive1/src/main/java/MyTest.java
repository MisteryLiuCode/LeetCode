import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,0,1,1,0,1};
        System.out.println(myTest.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                list.add(i);
            }
        }
        list.add(nums.length);
        int res=list.get(0);
        for (int i = 0; i < list.size()-1; i++) {
            res=Math.max(res,list.get(i+1)-list.get(i)-1);
        }
        return res;
    }


}
