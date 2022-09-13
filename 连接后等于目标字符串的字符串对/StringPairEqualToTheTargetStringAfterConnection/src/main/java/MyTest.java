public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int numOfPairs(String[] nums, String target) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j==i){
                    continue;
                }
                if (nums[i].length()>target.length() ){
                    break;
                }
                else if (nums[i].length()+nums[j].length()!=target.length()){
                    continue;
                }
                else if ((nums[i]+nums[j]).equals(target)){
                    res++;
                }
            }
        }
        return res;
    }


}
