/**
 * @program: TenTheMinimumNumberOfBinaryNumbers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-21 14:04
 **/


public class MyTest {
    public static void main(String[] args) {

    }

    public int minPartitions(String n) {
//        对n循环
        int result=0;
        for (int i=0;i<n.length();i++){
//            因为chartAt返回的字符，直接转换为int的时候，为Assci值
            result=result<(n.charAt(i)-48)?(n.charAt(i)-48):result;
        }
        return result;
    }

}
