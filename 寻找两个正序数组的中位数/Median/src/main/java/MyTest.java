import java.util.ArrayList;
import java.util.Collections;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        //1,2,2,3,3,4
        int[] num1=new int[]{1,2};
        int[] num2=new int[]{3,4};
        System.out.println(myTest.findMedianSortedArrays(num1, num2));
    }

    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        int n=list.size();
        if (n%2==0){
            return (list.get(n/2-1)+list.get(n/2))/2.0;
        }
        else {
            return list.get(n/2);
        }
    }


}
