/**
 * @program: JumpingGame
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-11 23:15
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{0,1};
        System.out.println(myTest.canJump(nums));
    }

    public boolean canJump(int[] nums) {
//        遍历数组
        int flag=0;
        for (int i= nums.length-1;i>=0;i--){
            if (nums[i]==0){
                for (int j=0;j<=i;j++){
//                    这里设置-1，是为了防止三种情况的发生
//                    1、进入了这个循环  进入了if语句 true
//                    2、没有进入这个循环，true
//                    3、进入了循环，没有进入if语句，跳出了循环 false
                    flag=-1;
//                    考虑到最后一个数字是0的情况下，只需要判断能不呢过到达最后一个位置即可
//                    就不需要跨过这个0了，因为这就是最后一个位置
                    if (i==nums.length-1){
                        if (nums[j]>=i-j){
                            flag=1;
                            break;
                        }
                    }
//                    否则的话，这个0就不是最后一个0，那么需要判断难呢过不能跳过这个位置
                    else if (nums[j]>i-j){
                        flag=1;
                        break;
                    }
                }
                if (flag==-1){
                    return false;
                }
            }
        }
        return true;
    }

}
