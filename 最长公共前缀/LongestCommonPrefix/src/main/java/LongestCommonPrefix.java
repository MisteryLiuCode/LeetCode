import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: LongestCommonPrefix
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-13 17:03
 **/


public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strings = new String[31];
        strings = new String[]{"ab","a"};
        System.out.println(longestCommonPrefix.myTest(strings));
    }
    public String myTest(String[] strs ) {

//        先判断长度是否为0，如果为0，直接返回""
        if(strs.length==0) {
            return "";
        };
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
//            这个startWith方法简直不知道省了多长时间，几乎没用过，根本想不起来
            while(!string.startsWith(s)){
//                当缩短为0的时候，代表没有公共字符串，就设置为"".
                if(s.length()==0) {
                    return "";
                }
                //公共前缀不匹配就让它变短！
//                我服了，就这样就写出来了！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
