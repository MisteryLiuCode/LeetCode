
/**
 * @program: VariableValueAfterOperation
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-30 23:58
 **/


public class MyTest {

    public int finalValueAfterOperations(String[] operations) {
        int result=0;
//        遍历
        for (int i = 0; i < operations.length; i++) {
//            判断每一个操作数中间的字符是+还是-
            if (operations[i].charAt(1)=='+'){
                result++;
            }
            else {
                result--;
            }
        }
        return result;
    }
}



