import java.util.ArrayList;

/**
 * @program: NumberOfLaserBeamsInTheBank
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-25 11:37
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] bank=new String[]{"011001","000000","010100","001000"};
        System.out.println(myTest.numberOfBeams(bank));
    }
    public int numberOfBeams(String[] bank) {
//        保存结果
        int result=0;
//        保存第一个1的个数
        int a=0;
//        保存第二个1的个数
        int b=0;
//        对数组进行遍历
        for (int i = 0; i < bank.length-1; i++) {
//            每次遍历，重置
            a=0;
            b=0;
            for (int j=0;j<bank[i].length();j++){
//                相邻两个，第一个为1的个数
                if (bank[i].charAt(j)=='1'){
                    a++;
                }
            }
//            第二个为1的个数
            for (int j=0;j<bank[i+1].length();j++){
                if (bank[i+1].charAt(j)=='1'){
                    b++;
                }
            }
//            如果第二个为1，把第一个里面的元素赋值给第二个
            if (b==0){
               bank[i+1]=bank[i];
            }
//            算出结果，加到result里
            result+=a*b;
        }
        return result;
    }



    public int numberOfBeams2(String[] bank) {
        int result=0;
        int flag=0;
        ArrayList<Integer> integers = new ArrayList<>();
//        对数组进行遍历
        for (int i = 0; i < bank.length; i++) {
            flag=0;
            for (int j=0;j<bank[i].length();j++){
                if (bank[i].charAt(j)=='1'){
                    flag++;
                }
            }
            if (flag!=0){
                integers.add(flag);
            }
        }
        for (int i = 0; i < integers.size()-1; i++) {
            result+=integers.get(i)*integers.get(i+1);
        }
        return result;
    }
}
