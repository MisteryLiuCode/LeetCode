public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(myTest.islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {
//        创建一个数组，四个方向
        int[][] direction = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    for (int k = 0; k < direction.length; k++) {
                        int x = direction[k][0] + i;
                        int y = direction[k][1] + j;
//                        超过边界或者水域
                        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }


}
