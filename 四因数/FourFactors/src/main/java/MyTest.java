public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{16};
        System.out.println(myTest.sumFourDivisors(nums));
    }
    public int sumFourDivisors(int[] nums) {
        int result=0;
//        对nums遍历
        for (int i=0;i<nums.length;i++){
            int count=0;
            int sum=0;
//            对每个数遍历，到开根号
            for (int j=1;j<=Math.sqrt(nums[i]);j++){
                if (nums[i]% j==0){
                    if(nums[i]/j!=j){
                        count+=2;
                    }
                    else {
                        count++;
                    }
                    sum+=j;
                    sum+=nums[i]/j;
                }
            }
            if (count==4){
                result+=sum;
            }
        }
        return result;
    }


}
