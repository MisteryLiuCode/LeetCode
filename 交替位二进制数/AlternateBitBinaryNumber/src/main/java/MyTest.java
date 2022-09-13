public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.hasAlternatingBits(5));
    }

    public boolean hasAlternatingBits(int n) {
        if (n==1){
            return false;
        }
        Boolean flag = true;
        String str = "";
        while (n != 0) {
            str = n % 2 + str;
            n = n / 2;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


}
