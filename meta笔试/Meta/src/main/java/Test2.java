import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Meta
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-19 13:38
 **/


public class Test2 {
    public static void main(String[] args) {
        int [] x={4,3,2,15};
        int answer = Test2.answer(x);
        System.out.println(answer);
    }

    public static int answer(int[] x) {
        int n=29;
//        对数组从小到大进行排序
        for (int i = 0; i <= x.length - 2; i++) {
            for (int j = i + 1; j < x.length - 1; j++) {
                if (x[i] > x[j]) {
                    // 交换位置
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(x));
//        数组已经从小到大进行排序
        int output=0;
        for (int i = 0; i < x.length; i++) {
            if (n<=x[i]) {
                output = i;
            }
            if (i==x.length-1){
                output=x.length;
            }
            }
//        System.out.println(output);
        //        4作为输入，求约数
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 1; i <=output; i++) {
            list.add(i);
        }
//    双重循环判断约数
        List<Integer> res=new ArrayList<Integer>();
            for (int j = 0; j < output; j++) {
                if ( output%list.get(j)==0){
                    res.add(list.get(j));
                }
            }
//            判断数组的长度是否为0，如果为0，则返回6
        if (res.size()==0){
            return 6;
        }
//        1,2,3,4,5,6,

        int result=0;
        if (res.size()%2==1){
            if (res.size()>=7){
                for (int i=res.size()/2-3;i<=res.size()/2+3;i++){
                    result+=res.get(i);
                }
            }
            else {
                for (int i = 0; i < res.size(); i++) {
                    result+=res.get(i);
                }
            }
        }
        else {
            if (res.size()>=6){
                for (int i=res.size()/2-3;i<=res.size()/2+3;i++){
                    result+=res.get(i);
                }
            }
            else {
                for (int i = 0; i < res.size(); i++) {
                    result+=res.get(i);
                }
            }
        }


        return result;
        }

    }

