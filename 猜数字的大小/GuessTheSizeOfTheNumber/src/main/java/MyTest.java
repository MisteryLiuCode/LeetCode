/**
 * @program: GuessTheSizeOfTheNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-17 16:54
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.guessNumber(2126753390));

    }

        public long guessNumber(int n) {
//        如果输入数字和猜的数字一样
            if (guess(n) == 0) {
                return n;
            }
//            result初始值设为一半
            int begin = 1;
            int end = n;
//            先除以2，再相加，防止移除
            int result = begin + (end - begin) / 2;
            int flag = guess(result);
//            如果不为0
            while (flag != 0) {
                if (flag == 1) {
//                    如果为1，说明猜的数字小了，就让begin设为当前值，end不变
                    begin = result;
//                    除以2继续判断
                    result = begin + (end - begin) / 2;
                    flag = guess(result);
                    continue;
                }
//                如果结果为-1，说明猜的太大了，就让end等于当前值
                else if (flag == -1) {
                    end = result;
                    result = begin + (end - begin) / 2;
                    flag = guess(result);
                    continue;
                }
            }
            return result;
        }

        //    long转int
        int con(long num) {
            Long l = new Long(num);
            return l.intValue();
        }

        int guess(int num) {
            if (num < 1702766719) {
                return 1;
            }
            if (num > 1702766719) {
                return -1;
            } else {
                return 0;
            }

        }

    }

