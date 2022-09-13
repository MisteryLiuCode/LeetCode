/**
 * @program: MaintainTheCitySkyline
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-20 14:09
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int i = myTest.maxIncreaseKeepingSkyline(grid);
        System.out.println(i);

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int length=grid.length;
//        双重循环遍历，并且赋值给结果数组
        int result = 0;
//        先找出每行每列的最大值
        int[] rowMax=new int[length];
//        行和列相等，找出每一列中的最大值
        int[] columnMax=new int[length];
//        找出每一行每一列的最大值
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
//                这里把最大的放进rowMax[i]，每次比较的时候直接和rowMax[i]比较
                rowMax[i]=Math.max(rowMax[i],grid[i][j]);
//                同理
                columnMax[i]=Math.max(columnMax[i],grid[j][i]);
            }
        }

//        这里rowMax和columnMax里面存储的分别是行最大值和列最大值
//        再次循环求出每一个增加的值是多少
//        同一行列的取值只能取同一行列最大数中最小的数
        int maximum=0;
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                maximum=rowMax[i]<columnMax[j]?rowMax[i]: columnMax[j];
                result+=maximum-grid[i][j];
            }
        }
        return result;
    }
}
