import java.util.HashSet;

/**
 * @program: EffectiveSudoku
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-03 10:33
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        char[][] board=new char[][]{
        }
        myTest.isValidSudoku()
    }

    public boolean isValidSudoku(char[][] board) {
//        防止重复用hashSet
        HashSet<Character> characterHashSet = new HashSet<>();
//        横着遍历
        for (int i = 0; i < board.length; i++) {
            characterHashSet.clear();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!characterHashSet.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        characterHashSet.clear();
//        列遍历
        for (int i = 0; i < 9; i++) {
            characterHashSet.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (!characterHashSet.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        characterHashSet.clear();
//        方框遍历
            for (int i = 0; i < 7; i=i+3) {
                for (int j = 0; j < 7; j=j+3) {
                    if (!block(i,j,board)){
                        return false;
                    }
                }
            }
            return true;
        }

    public boolean block(int x,int y,char[][] board) {
        HashSet<Character> charactersBlock = new HashSet<>();
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] != '.') {
                    if (!charactersBlock.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
