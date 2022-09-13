/**
 * @program: WarshipOnDeck
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-11 18:06
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        char[][] board=new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println(myTest.countBattleships(board));
    }


    public int countBattleships(char[][] board) {
//        对二维数组进行遍历
        int result=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if (board[i][j]=='X' && (i==0 || board[i-1][j]=='.') && (j==0 || board[i][j-1]=='.')){
                    result++;
                }
            }
        }
        return result;
    }
}
