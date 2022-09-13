public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.addStrings("11", "123"));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int cur = 0;
        while (i >=0 || j >= 0 || cur > 0) {
            int a=0;
            int b=0;
            if (i>=0){
                 a = num1.charAt(i--) - '0';
            }
            if (j>=0){
                 b = num2.charAt(j--) - '0';
            }
            int sum = a + b + cur;
            res.append(sum % 10);
            cur = sum / 10;
        }
        return res.reverse().toString();
    }
    public String addStrings2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0) carry += num1.charAt(i--)-'0';
            if(j>=0) carry += num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
