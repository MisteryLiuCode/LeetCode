public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] timeSeries=new int[]{1,4};
        System.out.println(myTest.findPoisonedDuration(timeSeries,2));
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res=0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            int m=timeSeries[i+1]-timeSeries[i];
            if (m>duration){
                res+=duration;
            }
            else {
                res+=m;
            }
        }
        return res+duration;
    }

}
