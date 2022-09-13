import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: ZigzagTransformation
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-24 21:09
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String s="AB";
        System.out.println(myTest.convert(s, 1));

    }
    public String convert(String s, int numRows) {
        if (numRows<2){
            return s;
        }
        String result="";
        int index=0;
        List<Character>[] lists = new ArrayList[numRows];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }
            for (int i=0;i<s.length();i++){
                index=i%(2 * numRows - 2);
                if(index>=numRows){
                    index = (2 * numRows - 2) - index;
                }
                lists[index].add(s.charAt(i));
            }
        for (int i=0;i<lists.length;i++){
            for (int j=0;j<lists[i].size();j++){
                result+=lists[i].get(j);
            }
        }
        return result;
    }
}
