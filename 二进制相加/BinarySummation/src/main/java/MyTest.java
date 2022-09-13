/**
 * @program: BinarySummation
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-20 20:03
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
//        两个数相加，如果末尾的数两个不为1，那么直接返回，
//        否则循环判断如果有两个数都为0，那么就返回，否则就增加一位，其余都设置为0

//        把两个数都补成完整的数。
//        String c="";
        while (a.length()>b.length()){
                b="0"+b;
        }
        while (a.length()<b.length()){
                a="0"+a;
        }
//        System.out.println(a);
//        System.out.println(b);
//        可以达到两个数位数是一样的，对任意一个数进行循环

        int carry=0;
        StringBuilder reslut=new StringBuilder();

            for (int i = a.length() - 1; i >= 0; i--) {
//                if (a.charAt(i) != 0 && b.charAt(i) != 0) {
//
//                }
//                两个数进行转换
//                这样强制加上或者减去一个字符串就可以转换为int类型
                int a_n=a.charAt(i)-'0';
                int b_n=b.charAt(i)-'0';
                int number=0;
                if ((a_n+b_n+carry)>=2){
                    number=(a_n+b_n+carry)%2;
//                    表示进位
                    carry=1;
                }
                else {
//                    每次进位，不是1，就是0，不可能有其他，所以如果没有超过2，进位就设置为0；、
                    number=a_n+b_n+carry;
                    carry=0;
                }
//                每次循环完之后，就知道这个数是0，还是1，但注意，这是正向添加
                reslut.append(number);
            }
//            如果跳出循环之后最后carry为1，说明，还需要添加一位
        if (carry!=0){
            reslut.append(1);
        }
//        最后把result倒过来就是答案
        return reslut.reverse().toString();
        }
}
