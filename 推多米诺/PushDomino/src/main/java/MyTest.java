/**
 * @program: PushDomino
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-21 17:37
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.pushDominoes(".L.R...LR..L.."));
    }

    public String pushDominoes(String dominoes) {
        String tmp = "";
//        如果字符串没有再变化了，就跳出循环
        while (!dominoes.equals(tmp)) {
//            每次开始把当前的赋值新的值
            tmp = dominoes;
//            把R.L替换成T，是为了保证这个整体
            dominoes = dominoes.replace("R.L", "T")
//                    把R.替换成RR
                    .replace("R.", "RR")
//                    把.L替换成LL
                    .replace(".L", "LL")
//                    再把T替换回R.L
                    .replace("T", "R.L");
        }
        return dominoes;
    }


}
