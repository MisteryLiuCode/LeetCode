import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: NumberOfRectanglesThatCanFormTheLargestSquare
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-04 10:48
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] rectangles=new int[][]{{5,8},{3,9},{5,12},{16,5}};
        System.out.println(myTest.countGoodRectangles(rectangles));
    }

    public int countGoodRectangles(int[][] rectangles) {
//        设置结果值
        int result=0;
//        假设最大值是第一个数
        int max=rectangles[0][0]<rectangles[0][1]?rectangles[0][0]:rectangles[0][1];
        int twoNumMax=0;
//        max添加到数组中
        int[] maxNums=new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            twoNumMax=rectangles[i][0]<rectangles[i][1]?rectangles[i][0]:rectangles[i][1];
                if (twoNumMax==max){
                    result++;
                }
                if (twoNumMax>max){
                    result=1;
                    max=twoNumMax;
                }
        }

        return result;
    }
}
