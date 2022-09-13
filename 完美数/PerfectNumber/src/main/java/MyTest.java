public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.checkPerfectNumber2(28));
    }

    public boolean checkPerfectNumber1(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num ? true : false;
    }


    public boolean checkPerfectNumber2(int num) {
//         关键的一步，可以减少遍历的次数，不知道为什么要开根号
        int index = (int) Math.sqrt(num);
        int sum = 1;
//        1和2都没有
        if (num == 1 || num == 2) {
            return false;
        }
        for (int i = 2; i <= index; i++) {
            if (num % i == 0) {
//                    加上前后两个值
                sum += (i + num / i);
            }
        }
        return sum == num ? true : false;
    }
}