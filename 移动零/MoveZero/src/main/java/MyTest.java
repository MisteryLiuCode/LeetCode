/**
 * @program: MoveZero
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-02 13:59
 **/


public class MyTest {

    public void moveZeroes(int[] nums) {
//        设置num记录0的个数，初始为1
        int num=1;
        int n=nums.length;
        int temp=0;
        while (num!=0){
            for (int i=0;i<n-1;i++){
//                如果其中有一个为0
                if (nums[i]==0){
//                    0的个数数+1
                    num++;
//                    挨着个交换，使0换到最后面
                   temp=nums[i+1];
                   nums[i+1]=nums[i];
                   nums[i]=temp;
                }
            }
//            跳出循环，总数-1；
            num--;
//            如果可能有下一次，则遍历的最终位置-1；
            n--;
        }
    }


}
