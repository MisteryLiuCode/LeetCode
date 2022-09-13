import java.util.Arrays;

/**
 * @program: GridLighting
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-08 10:11
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[][] lamps=new int[][]{{0,0},{4,4}};
//        int[][] lamps=new int[][]{{0,0},{0,4}};
        int[][] lamps=new int[][]{{0,0},{0,1},{0,4}};
//        int[][] queries=new int[][]{{1,1},{1,0}};
//        int[][] queries=new int[][]{{1,1},{1,1}};
//        int[][] queries=new int[][]{{0,4},{0,1},{1,4}};
        int[][] queries=new int[][]{{0,0},{0,1},{0,2}};

        int[] ints = myTest.gridIllumination(5, lamps, queries);
//        myTest.gridIllumination(5, lamps, queries);
        System.out.println(Arrays.toString(ints));
    }

    public int[] gridIllumination(int n, int[][] lamps, int[][] queries){
//        创建nXn的数组
        int [][] arr=new int[n][n];

//        定义一个方向数组，分别为上下左右和对角线
        for (int i=0;i< lamps.length;i++) {
//            -1代表点亮，1代表照亮
            arr[lamps[i][0]][lamps[i][1]] = -1;
//            上下边点亮
            for (int j = 0; j < n; j++) {
                if (arr[j][lamps[i][1]] == -1) {
                    continue;
                }
                if (arr[j][lamps[i][1]] == -1 && j!=0) {
                    arr[j][lamps[i][1]]-=1;
                    continue;
                }
                arr[j][lamps[i][1]] += 1;
            }
//            左右边点亮
            for (int j = 0; j < n; j++) {
                if (arr[lamps[i][0]][j] == -1) {
                    continue;
                }
                if (arr[lamps[i][0]][j] == -1 && j!=0) {
                    arr[lamps[i][0]][j]-=1;
                    continue;
                }
                arr[lamps[i][0]][j] += 1;
            }
//            设置两个指针，一个往西北走，一个往东南走
            int[] westTemp = new int[2];
            int[] eastTemp = new int[2];

            westTemp[0] = lamps[i][0];
            westTemp[1] = lamps[i][1];
            eastTemp[0] = lamps[i][0];
            eastTemp[1] = lamps[i][1];
//            西北东南对角线点亮
            for (int j = 1; j < n; j++) {
                if (westTemp[0] != 0 && westTemp[1] != 0 && arr[lamps[i][0] - j][lamps[i][1] - j] != -1) {
                    arr[lamps[i][0] - j][lamps[i][1] - j] += 1;
                    westTemp[0] = lamps[i][0] - j;
                    westTemp[1] = lamps[i][1] - j;
                }
//                东北和西南方向点亮
                if (eastTemp[0] != n - 1 && eastTemp[1] != n - 1 && arr[lamps[i][0] + j][lamps[i][1] + j] != -1) {
                    arr[lamps[i][0] + j][lamps[i][1] + j] += 1;
                    eastTemp[0] = lamps[i][0] + j;
                    eastTemp[1] = lamps[i][1] + j;
                }
            }
            for (int k1=0;k1<arr.length;k1++){
                for (int k2=0;k2<arr[i].length;k2++){
                    System.out.print(arr[k1][k2]+"  ");
                }
                System.out.println();
            }
            System.out.println("===================");

        }

        int[] result=new int[queries.length];
//        对queries进行遍历
//        设定八个方向的数组
        int[][] direction=new int[][]{{0,0},{0,-1},{0,1},{-1,0},{1,0},{-1,-1},{1,1},{-1,1},{1,-1}};
        for (int m=0;m< queries.length;m++){
            if (arr[queries[m][0]][queries[m][1]]!=0 ){
                result[m]=1;
//                八个方向判断有没有开着的灯
                for (int k=0;k<8;k++){
//                    代表超出了界线
                    if (queries[m][0]+direction[k][0]<0 || queries[m][0]+direction[k][0]>n-1 || queries[m][1]+direction[k][1]<0 ||queries[m][1]+direction[k][1]>n-1) {
                        continue;
                    }
//                    代表灯在亮
                    if (arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]] == -1) {
                        int a=queries[m][0] + direction[k][0];
                        int b=queries[m][1] + direction[k][1];
//                        关闭这个位置的灯
                        //        定义一个方向数组，分别为上下左右和对角线
//            上下边灭
                            for (int j = 0; j < n; j++) {
                                if (arr[j][queries[m][1] + direction[k][1]] == -1) {
                                    continue;
                                }
                                arr[j][queries[m][1] + direction[k][1]] -= 1;
                            }
//            左右边点亮
                            for (int j = 0; j < n; j++) {
                                if (arr[queries[m][0] + direction[k][0]][j] == -1) {
                                    continue;
                                }
                                arr[queries[m][0] + direction[k][0]][j]-= 1;
                            }
//            设置两个指针，一个往西北走，一个往东南走
                            int[] westTemp = new int[2];
                            int[] eastTemp = new int[2];

                            westTemp[0] = queries[m][0] + direction[k][0];
                            westTemp[1] = queries[m][1] + direction[k][1];
                            eastTemp[0] = queries[m][0] + direction[k][0];
                            eastTemp[1] = queries[m][1] + direction[k][1];
//            西北东南对角线点亮
                            for (int j = 1; j < n; j++) {
                                if (westTemp[0] != 0 && westTemp[1] != 0 && arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]] != -1) {
                                    arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]] -= 1;
                                    westTemp[0] = queries[m][0] + direction[k][0] - j;
                                    westTemp[1] = queries[m][1] + direction[k][1] - j;
                                }
//                东北和西南方向点亮
                                if (eastTemp[0] != n - 1 && eastTemp[1] != n - 1 && arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]] != -1) {
                                    arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]] -= 1;
                                    eastTemp[0] = queries[m][0] + direction[k][0] + j;
                                    eastTemp[1] = queries[m][1] + direction[k][1] + j;
                                }
                            }
//                            把灯关闭
                        arr[a][b]=Math.abs(arr[a][b]+1);
//                        arr[queries[m][0] + direction[k][0]][queries[m][1] + direction[k][1]]=0;

                        for (int k1=0;k1<arr.length;k1++){
                            for (int k2=0;k2<arr[m].length;k2++){
                                System.out.print(arr[k1][k2]+"  ");
                            }
                            System.out.println();
                        }
                        System.out.println("===================");
                    }

                }
            }

        }
        return result;
    }
}
