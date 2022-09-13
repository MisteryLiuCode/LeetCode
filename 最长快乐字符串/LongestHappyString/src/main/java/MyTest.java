import java.util.Arrays;

/**
 * @program: LongestHappyString
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-07 10:25
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.longestDiverseString(1, 0, 3));
    }


    public String longestDiverseString(int a, int b, int c) {
//        把字符的多少添加进数组中，每次对数组进行排序，取最多的
        int[] array = new int[]{a, b, c};
//        定义StringBuffer
        String result = "";
//        记录各个字符已经出现的次数
        int a1=0;
        int b1=0;
        int c1=0;
        while (array[0] != 0 || array[1] != 0 || array[2] != 0) {
//            对字符进行排序
            Arrays.sort(array);
            if (array[2] == a) {
//                如果'a'连续出现的次数已经为2了，并且上一个多的数为0，那么说明就不能连续了，直接跳过循环
                if (a1==2){
                    if (array[1]==0){
                        break;
                    }
//                    如果最大的为b，那么就拼接上b，数量减去1
                    if (array[1]==b){
                        result += 'b';
                        array[1] -= 1;
                        b -= 1;
                    }
//                    同上如果等于c就拼接并且减去
                    else if (array[1] == c) {
                        result += 'c';
                        array[1] -= 1;
                        c -= 1;
                    }
//                    把次数从2置为0
                    a1=0;
                    continue;
                }
//                如果不大于2，就可以继续连接
                result += 'a';
                array[2] -= 1;
                a -= 1;
                a1++;
//                但是要把其他两个置为0，因为正常情况下不进上面的if(==2)也会出现比如，bba，这样b1就会一直为2，但是这个时候b1需要重新计数
                b1=0;
                c1=0;
                continue;
            }
//            以下判断b和c都是同上
            if (array[2] == b) {
                if (b1==2){
                    if (array[1]==0){
                        break;
                    }

                    if (array[1]==a){
                        result += 'a';
                        array[1] -= 1;
                        a -= 1;
                    }
                    else if (array[1] == c) {
                        result += 'c';
                        array[1] -= 1;
                        c -= 1;
                    }
                    b1=0;
                    continue;
                }

                result += 'b';
                array[2] -= 1;
                b -= 1;
                b1++;
                a1=0;
                c1=0;
                continue;
            }

            if (array[2] == c) {
                if (c1==2){
                    if (array[1]==0){
                        break;
                    }
                    if (array[1]==b ){
                        result += 'b';
                        array[1] -= 1;
                        b -= 1;
                    }
                    else if (array[1] == a  ) {
                        result += 'a';
                        array[1] -= 1;
                        a -= 1;
                    }
                    c1=0;
                    continue;
                }

                result += 'c';
                array[2] -= 1;
                c -= 1;
                c1++;
                a1=0;
                b1=0;
            }
        }
        return result;
    }
}
