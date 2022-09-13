public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int result=0;

        for (int i = 0; i < points.length-1; i++) {
            int max=0;
            int left=Math.abs(points[i+1][0]-points[i][0]);
            int right=Math.abs(points[i+1][1]-points[i][1]);
            if (left<right){
                max=right;
            }
            else {
                max=left;
            }
          result+=max;
        }
        return result;
    }




}