import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[][] queries=new int[][]{{1,17},{4,5},{14,17},{5,11},{15,16}};
        System.out.println(Arrays.toString(myTest.platesBetweenCandles("***|**|*****|**||**|*", queries)));
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int left=0;
        int right=0;
        /*
        | * | * |
        0 1 2 3 4
        * */

        int[] result=new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
//            记录是蜡烛，但不是最后的一个的个数
            int count1=0;
            int count2=0;
//            用来标识是第一个还是最后一个
            int falg=0;
            for (int j=0;j<=queries[i][1];j++){
                if (s.charAt(j)=='|'){
                    if (j<queries[i][0] && falg==0){
                        count1++;
                        left=j;
                        falg++;
                    }
                    else if (falg==0 || falg==1){
                        count1++;
                        falg++;
                        left=j;
                    }
                    else {
                        falg++;
                        right=j;
                    }
                     count2++;
                }
            }
            if (falg==3){
                result[i]=right-left-(count2-count1);
            }
            else {
                result[i]=0;
            }
        }
        return result;
    }


}