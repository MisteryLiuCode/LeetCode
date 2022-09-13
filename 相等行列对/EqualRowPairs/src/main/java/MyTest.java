/**
 * @ClassName MyTest
 * @Description
 * @Author 刘帅彪
 * @Date2022/7/24 13:22
 **/
public class MyTest {
    public static void main(String[] args) {
        int[][] grid=new int[][]{{3,2,1},{1,7,6},{2,7,7}};
        MyTest myTest = new MyTest();
        System.out.println(myTest.equalPairs(grid));

    }
    public int equalPairs(int[][] grid) {
        int res = 0;
//        枚举行
        for (int i = 0; i < grid.length; i++) {
//            枚举列
            for (int j = 0; j < grid[i].length; j++) {
//                i代表行，j代表列，比较行和列是否相等
                boolean check = check(i, j, grid);
                if (check){
                    res++;
                }
            }
        }
        return res;
    }
    public boolean check(int i,int j,int[][] grid){
        int n=grid[0].length;
        for (int m=0;m<n;m++){
            if (grid[i][m]!=grid[m][j]){
                return false;
            }
        }
        return true;
    }
}
