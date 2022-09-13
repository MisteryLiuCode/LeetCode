/**
 * @program: RotateImage
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-29 18:35
 **/


public class MyTest {

    public void rotate(int[][] matrix) {
//        转置
        int temp=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<i;j++){
                matrix[i][j]=temp;
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
//        镜像
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<(matrix.length+1)/2*matrix.length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[i].length-i-1];
                matrix[i][matrix[i].length-i-1]=temp;
            }
        }
    }
}
