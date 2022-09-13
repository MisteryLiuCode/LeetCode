public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            String target=String.valueOf(num);
            if (target.length()%2==0){
                result++;
            }
        }
        return result;
    }

}
