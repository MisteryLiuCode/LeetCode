import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums1=new int[]{1,2,3,3};
        int[] nums2=new int[]{1,1,2,2};
        List<List<Integer>> difference = myTest.findDifference(nums1, nums2);
        System.out.println(difference);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> answer0 = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();

        answer0=calculation(nums1, nums2, answer0);
        answer1=calculation(nums2, nums1, answer1);
        res.add(answer0);
        res.add(answer1);
        return res;
    }

    public  List<Integer> calculation(int[] nums1,int[] nums2,List<Integer> answer){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            Boolean flag=true;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    flag=false;
                    break;
                }
            }
            if (flag==true && set.add(nums1[i])){
                answer.add(nums1[i]);
            }
        }
        return answer;
    }


}
