import java.util.ArrayList;
import java.util.List;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/25 17:29
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        MyTest myTest = new MyTest();
        List<Integer> res= myTest.findClosestElements(arr, 4, 3);
        System.out.println(res );

    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        while (right-left+1>k){
            if (x-arr[left]<arr[right]-x){
                right--;
            }
            else if (x-arr[left]>arr[right]-x){
                left++;
            }
            else {
                right--;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i=left;i<=right;i++){
            res.add(arr[i]);
        }
        return res;
    }


}
