public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int[] sortArrayByParity(int[] nums) {
//        定义一个新的数组，和结果数组一样大小
        int[] resNums=new int[nums.length];
        int j=nums.length-1;
        int i=0;
        for (int num : nums) {
            if (num %2==0){
                resNums[i++]=num;
            }
            else{
                resNums[j--]=num;
            }
        }
        return resNums;
    }

}
