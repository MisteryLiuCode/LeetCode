/**
 * @program: WordSearch
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-02 11:24
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        System.out.println(myTest.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
//        定义方向的数组
        int[][] direction = new int[][]{{0,0},{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
//        遍历二维数组
        int temp = 0;
//        获取周围的位置
        int x = 0;
        int y = 0;

        int l=0;
        int r=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (l!=0 || r!=0){
                    i=l;
                    j=r;
                }
//                回退一次
                if (temp == word.length()) {
                    return true;
                }

                for (int k = 0; k < direction.length; k++) {
                    x = i + direction[k][0];
                    y = direction[k][1] + j;
                    if (x >= 0 && x < board.length && y >= 0 && y < board[i].length && board[x][y] == word.charAt(temp)) {
                        if (k>0){
                            l=x;
                            r=y;
                            temp++;
                            board[x][y] = 'a';
                            break;
                        }
                        else {
                            l = 0;
                            r = 0;
                            temp++;
                            i = x;
                            j = y;
                            board[x][y] = 'a';
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }


}
