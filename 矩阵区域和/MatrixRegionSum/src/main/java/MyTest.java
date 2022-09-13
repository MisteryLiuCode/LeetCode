import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[][] mat=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat=new int[][]{{67,64,78},{99,98,38},{82,46,46},{6,52,55},{55,99,45}};
        System.out.println(Arrays.deepToString(myTest.matrixBlockSum(mat, 3)));
    }

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res=new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int x1=(i-k)<0?0:(i-k);
                int x2=(i+k)>=mat.length?mat.length:(i+k+1);
                int y1=(j-k)<0?0:(j-k);
                int y2=(j+k)>=mat[0].length?mat[0].length:(j+k+1);
                for (int m=x1;m<x2;m++){
                    for (int n=y1;n<y2;n++){
                        res[i][j]+=mat[m][n];
                    }
                }
            }
        }
        return res;
    }


}
