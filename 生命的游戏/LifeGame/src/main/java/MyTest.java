/**
 * @program: LifeGame
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-27 19:22
 **/


public class MyTest {
    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        MyTest myTest = new MyTest();
        myTest.gameOfLife(board);
    }


    public void gameOfLife(int[][] board) {

        int[][] cloneBoard = new int[board.length][board[0].length];

//        深拷贝数组
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                cloneBoard[i][j] = board[i][j];
            }
        }

        //                八种情况
        int[][] liveOrDie = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int nums = 0;
//        获取周围的位置
        int x=0;
        int y=0;
//        对原数组进行遍历
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                nums = 0;
                for (int k = 0; k < 8; k++) {
//                    坐标为 border[i,border[i][j]]
                    x = i + liveOrDie[k][0];
                    y = j + liveOrDie[k][1];
                    if (x >= 0 && x < board.length && y >= 0 && y < board[i].length && cloneBoard[x][y] == 1) {
                        nums++;
                    }
                }
//                判断1的个数
                if (nums < 2) {
                    board[i][j] = 0;
                }
                if (nums > 3 && board[i][j] == 1) {
                    board[i][j] = 0;
                    continue;
                }
                if (nums == 3 && board[i][j] == 0) {
                    board[i][j] = 1;
                    continue;
                }
            }
        }
    }
}
