import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: SimplestFraction
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-10 09:47
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.simplifiedFractions(4);
    }

    public List<String> simplifiedFractions(int n) {
//        创建结果集
        List<String> result = new ArrayList<>();
//        先把分子为1的放入结果集
        for (int i=2;i<=n;i++){
            result.add("1/"+String.valueOf(i));
        }
        int flag=0;
//        分母从2开始
        for (int i=2;i<=n;i++){
            for (int j=i+1;j<=n;j++){
//                重置flag
                flag=0;
//                对分子遍历
                for (int k=2;k<=i;k++){
//                    如果满足分子分母都求余结果为0，那么不是最简分数
                    if (j%k==0 && i%k==0){
                      flag=1;
                      break;
                    }
                }
//                遍历完之后，如果flag=0，那么可以添加进去
                if (flag==0){
                    result.add(String.valueOf(i)+"/"+String.valueOf(j));
                }
            }
        }
        return result;
    }

}
