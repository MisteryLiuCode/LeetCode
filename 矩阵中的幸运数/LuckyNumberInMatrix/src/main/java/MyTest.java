import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LuckyNumberInMatrix
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-15 10:21
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] matrix=new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        myTest.luckyNumbers(matrix);
    }

    public  List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result=new ArrayList<>();
//        获取列的最大值
        int[] columnMinArr=new int[matrix[0].length];
        for (int i=0;i< matrix[0].length;i++){
            int max= 0;
            for (int j=0;j< matrix.length;j++){
                max=max>matrix[j][i]?max:matrix[j][i];
            }
            columnMinArr[i]=max;
        }
        //        创建数组记录行最小值
        int[][] matrixClone=matrix.clone();
        int[] rowMinArr=new int[matrix.length];
        for (int i=0;i< matrix.length;i++){
            matrix=matrixClone;
            Arrays.sort(matrix[i]);
            rowMinArr[i]=matrix[i][0];
        }
//        因为矩阵中所有的数不相等，所以如果行最小值和列最大值有两个数相等，那么这个数一定对应在所在的列和行中
        for (int i=0;i<columnMinArr.length;i++){
            for (int j=0;j< rowMinArr.length;j++){
                if (rowMinArr[j]==columnMinArr[i]){
                    result.add(rowMinArr[j]);
                }
            }
        }
        return result;
    }
}
