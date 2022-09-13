/**
 * @program: SubMatrixQuery
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-21 14:54
 **/


public class SubrectangleQueries {
    public static void main(String[] args) {
        int[][] rectangle=new int[][]{{3,9,4},{5,6,10}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);
        subrectangleQueries.updateSubrectangle(0,0,1,0,100);
    }
    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
//        创建结果数组
        this.rectangle=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
        for (int i=0;i<rectangle.length;i++){
            for (int j=0;j<rectangle[i].length;j++){
                System.out.println(rectangle[i][j]);
            }
        }
    }
    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }


}
