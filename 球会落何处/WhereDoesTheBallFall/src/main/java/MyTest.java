import java.util.Arrays;

/**
 * @program: WhereDoesTheBallFall
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-24 11:29
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] grid=new int[][]{{-1}};
        System.out.println(Arrays.toString(myTest.findBall(grid)));
    }
    public int[] findBall(int[][] grid) {
        int m= grid.length;
//        至少有一列
        int n=grid[0].length;
//        创建保存结果的集合
        int[] result=new int[n];
//        对小球遍历
        for (int i=0;i<n;i++){
            int k=i;
//            要对这一列的所有行进行遍历
            for (int j=0;j<m;j++){
//                这个k!=n-1;比如放在grid[j][k+1]==1前面，防止后面越界
                if (grid[j][k]==1 && k!=n-1 && grid[j][k+1]==1 ){
                    k++;
                }
//                这个k!=0;比如放在grid[j][k-1]==-1前面，防止后面越界
                else if (grid[j][k]==-1 && k!=0 && grid[j][k-1]==-1 ){
                    k--;
                }
//                不属于上面两种情况说明已经撞到墙了
                else {
                    result[i]=-1;
                    break;
                }
//                如果能够顺畅往前一直走到头，就可以把这个值设为最后一个数
                if (j==m-1){
                    result[i]=k;
                };
            }
        }
        return result;
    }





}
