import java.util.Arrays;

/**
 * @program: CountTheNumberOfDotsInACircle
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-21 10:31
 **/


public class MyTest {
    public static void main(String[] args) {
        int[][] points=new int[][]{{1,3},{3,3},{5,3},{2,2}};
        int[][] queries=new int[][]{{2,3,1},{4,3,1},{1,1,2}};
        MyTest myTest = new MyTest();
        int[] ints = myTest.countPoints(points, queries);
        System.out.println(Arrays.toString(ints));

    }

    public int[] countPoints(int[][] points, int[][] queries) {
//       存储答案
        int[] result = new int[queries.length];
        int oneResult = 0;
        for (int i = 0; i < queries.length; i++) {
//            重置result
            oneResult = 0;
            for (int j = 0; j < points.length; j++) {
//                做一个计算(x1-x2)^2+(y1-y2)^2开根号与半径相比
                if ((Math.pow((int) Math.pow((queries[i][0]-points[j][0]),2)+(int) Math.pow((queries[i][1]-points[j][1]),2), 1.0 / 2))<=queries[i][2]) {
                    oneResult++;
                }
            }
            result[i] = oneResult;
        }
        return result;
    }
}
