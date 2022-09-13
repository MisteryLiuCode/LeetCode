import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] citations=new int[]{11,15};
        System.out.println(myTest.hIndex(citations));
    }
    public int hIndex(int[] citations) {
//        对数组排序
        int result=0;
        Arrays.sort(citations);
//        用于倒着计数
        int count=0;
        int legth=citations.length;
        for (int i=legth-1;i>=0;i--){
            count++;
            if (count>citations[i]){
                result=--count;
            }
        }
//        如果遍历完都没有找到临界点，把result赋值为count
        result=result>0?result:count;
        return result;
    }



}