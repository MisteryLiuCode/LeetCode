/**
 * @program: GoldMiner
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-05 13:01
 **/


public class MyTest {
    public static void main(String[] args) {
        int[][] grid=new int[][]{{0,6,0},{5,8,7},{0,9,0}};
        MyTest myTest = new MyTest();
        System.out.println(myTest.getMaximumGold(grid));
    }

//    设置全局变量，两个方法都可以使用
    int ans = 0;
    int grid[][];
    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
//        筛选出所有大于0的数字
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    getGold(i, j, 0);
                }
            }
        }
        return ans;
    }

    public void getGold(int i, int j, int gold) {
//        如果不符合条件就直接return
        if (i == -1 || j == -1 || i == grid.length || j == grid[0].length || grid[i][j] == 0) {
            return;
        }
//        没有return，就可以把结果加进去
        int g = grid[i][j];
        gold += g;
//        防止下面的数对这一个数重复计算，就先把这个置为0
        grid[i][j] = 0;
//        比较最大值
        ans = Math.max(ans, gold);
//        向下走一个
        getGold(i + 1, j, gold);
//        向上走一个
        getGold(i - 1, j, gold);
//        向右走一个
        getGold(i, j + 1, gold);
//        想左走一个
        getGold(i, j - 1, gold);
//        能走到这说明这个位置的上下左右都找完了，回退一步
        gold -= g;
//        恢复这个之前置为0的数。
        grid[i][j] = g;
    }

}
