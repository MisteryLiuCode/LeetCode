import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: ScrambleLetters
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-09 11:46
 **/


public class Main {
    public static void main(String[] args) {
        Main myTest = new Main();
        myTest.test();
    }

    public void test(){
        Scanner in = new Scanner(System.in);        //类似于声明，真正执行在下面。
        int n=in.nextInt();
//        创建一个二维数组来存储其中每一个数组
        ArrayList<String> arrStr = new ArrayList<>();
        char[] chars=new char[n];
        for (int i = 0; i <n; i++) {
            String c=in.next();//输入字符串
//            对每个字符串进行遍历
                char[] charStr = c.toCharArray();
                Arrays.sort(charStr);
//                将char数组转换成字符串
            String s = String.valueOf(charStr);
//            将转换后的字符串加入到数组中
            arrStr.add(s);
        }
//        创建一个数组，用来保存
        int[] result=new int[n*2];
//        此时arrstr数组中保存中的字符串是排好序的字符
        for (int i = 0; i < arrStr.size(); i++) {
            int order=1;
            ArrayList<String> clone = (ArrayList<String>) arrStr.clone();
            clone.remove(i);
//            最高位置
            for (int j = 0; j < clone.size(); j++) {
                if (arrStr.get(i).charAt(arrStr.get(i).length()-1)>clone.get(j).charAt(0)){
                    order++;
                }
            }
//            最高位置存数组的奇数位
            result[i*2+1]=order;
        }

        //            最低位置
        for (int i = 0; i < arrStr.size(); i++) {
            int order=1;
            ArrayList<String> clone = (ArrayList<String>) arrStr.clone();
            clone.remove(i);
            for (int j = 0; j < clone.size(); j++) {
                if (arrStr.get(i).charAt(0)>clone.get(j).charAt(clone.get(j).length()-1)){
                    order++;
                }
            }
//            最低位置存偶数
            result[i*2]=order;
        }
        //        最后遍历数组，输出答案
        for (int i = 0; i < result.length; i=i+2) {
            System.out.print(result[i]+" ");
            System.out.println(result[i+1]);
        }
        }
}
