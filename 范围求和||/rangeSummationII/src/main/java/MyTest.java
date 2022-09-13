public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] ops = new int[][]{{2, 2}, {3, 3}};
        System.out.println(myTest.maxCount(3, 3, ops));
    }

    public int maxCount1(int m, int n, int[][] ops) {
        /**
         * 创建一个mxn的空数组
         */
        int[][] init = new int[m][n];

        for (int i = 0; i < ops.length; i++) {
            for (int x = 0; x < ops[i][0]; x++) {
                for (int y = 0; y < ops[i][1]; y++) {
                    init[x][y] += 1;
                }
            }
        }
        int max = 0;
        int count = 0;
        for (int[] ints : init) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                    count = 1;
                } else if (max == anInt) {
                    count++;
                }
            }
        }
        return count;
    }

    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length==0){
            return m*n;
        }
        /**
         * 遍历ops横坐标和纵坐标，分别最小相乘
         */
        int row = Integer.MAX_VALUE;
        int column = Integer.MAX_VALUE;
        for (int[] op : ops) {
            row = Math.min(op[0],row);
            column = Math.min(op[1],column);
        }
        return row*column;
    }

}
