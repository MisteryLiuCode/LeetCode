import java.util.Arrays;

/**
 * @program: WidestVerticalAreaBetweenTwoPointsThatDoesNotContainAnyPoints
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-29 20:59
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] points=new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(myTest.maxWidthOfVerticalArea(points));
    }
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xNumbers=new int[points.length];
        for (int i=0;i<points.length;i++){
            xNumbers[i]=points[i][0];
        }
//        排序
        Arrays.sort(xNumbers);
        int result=0;
        for (int i=0;i<xNumbers.length-1;i++){
            if (result<xNumbers[i+1]-xNumbers[i]){
                result=xNumbers[i+1]-xNumbers[i];
            }
        }
        return result;
    }
}
