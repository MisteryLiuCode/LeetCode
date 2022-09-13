import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[][] img=new int[][]{{1, 1, 1},{1, 0, 1},{1, 1, 1}};
//        int[][] img=new int[][]{{100,200,100},{200,50,200},{100,200,100}};
        int[][] img=new int[][]{{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        System.out.println(Arrays.deepToString(myTest.imageSmoother(img)));
    }
    public int[][] imageSmoother(int[][] img) {
        int[][] res=new int[img.length][img[0].length];
//        创建一个八方向的数组
        int[][] direction=new int[][]{{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        for (int i=0;i<img.length;i++){
            for (int j=0;j<img[0].length;j++){
                int sum=0;
                int count=0;
                for (int k=0;k< direction.length;k++){
                    int x=i+direction[k][0];
                    int y=j+direction[k][1];
                    if (x>=0 && x<img.length && y>=0 && y<img[0].length){
                        sum+=img[x][y];
                        count++;
                    }
                }
                res[i][j]=sum/count;
            }
        }
        return res;
    }

}
