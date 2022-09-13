public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result =new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int count=0;
            for (int j=i;j<temperatures.length;j++){
                if (temperatures[i]<temperatures[j]){
                    result[i]=count;
                    break;
                }
                else {
                    count++;
                }
            }
        }
        result[temperatures.length-1]=0;
        return result;
    }


}