public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res=0;
        int n=startTime.length;
        for (int i=0;i<n;i++){
            if (startTime[i]<=queryTime && endTime[i]>=queryTime){
                res++;
            }
        }
        return res;
    }


}
