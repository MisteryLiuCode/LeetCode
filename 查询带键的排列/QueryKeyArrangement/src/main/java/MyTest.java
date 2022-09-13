/**
 * @program: QueryKeyArrangement
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-13 17:01
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] queries=new int[]{3,1,2,1};
        myTest.processQueries(queries,5);
    }

    public int[] processQueries(int[] queries, int m) {
//        初始化数组
        int[] p=new int[m];
        for (int i=1;i<=m;i++){
            p[i-1]=i;
        }
//        对两个数组进行遍历
        int temp=0;
        int[] result=new int[queries.length];
        for (int i=0;i< queries.length;i++){
            for (int j=0;j< p.length;j++){
                if (queries[i]==p[j]){
                    result[i]=j;
//                    不是替换位置，而是挨着个交换位置
                    for (int k=j;k>0;k--){
                        temp=p[k];
                        p[k]=p[k-1];
                        p[k-1]=temp;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
