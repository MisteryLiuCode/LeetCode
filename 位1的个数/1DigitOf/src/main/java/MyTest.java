public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        System.out.println(myTest.hammingWeight(00000000000000000000000000001011));
//        System.out.println(myTest.hammingWeight(00000000000000000000000010000000));
//        System.out.println(myTest.hammingWeight(11111111111111111111111111111101));
    }

    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == 1) {
                sum++;
            }
        }
        return sum;
    }

    public int hammingWeight(int n) {
        String str = "";
        while (n != 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == 1) {
                sum++;
            }
        }
        return sum;
    }


}
