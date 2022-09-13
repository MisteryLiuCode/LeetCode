public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{4,3,2,6};
        System.out.println(myTest.maxRotateFunction(nums));
    }
    public int maxRotateFunctio2(int[] nums) {
        /*
        拼接两个数组  doubleArray[4,3,2,6,4,3,2,6]
         */
        int[] doubleArray = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            doubleArray[i]=nums[i];
            doubleArray[i+ nums.length]=nums[i];
        }

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j=0;j< nums.length;j++){
                sum+=j*doubleArray[j+i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }

    /**
     * 评论区
     * @param nums
     * @return
     */
    public int maxRotateFunction(int[] nums) {
        int temp = 0;
        int sum = 0;
        int len = nums.length;
        for (int i = len-1; i >= 0; --i) {
            sum += nums[i];
            temp += i * nums[i];
        }
        int max = temp; // 保存上一次结果
        for (int i = 1; i < len; ++i) {
             temp = temp + sum - len*nums[len-i];
            max = Math.max(temp, max);
        }
        return max;
    }


}
