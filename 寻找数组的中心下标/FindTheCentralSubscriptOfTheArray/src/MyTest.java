public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,7,3,6,5,6};
        System.out.println(myTest.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
//        sum
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

//        再次对nums遍历
//        边计算边看是否符合条件
        int n=0;
        for (int i = 0; i < nums.length; i++) {
//            因为是有一个中间坐标，所以需要用sum减去此时的下标
            if (n*2==sum-nums[i]){
                return i;
            }
//            继续累加
            n+=nums[i];
        }
        return -1;
    }


}
