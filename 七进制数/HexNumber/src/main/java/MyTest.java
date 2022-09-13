public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.convertToBase7(-7));
    }

    public String convertToBase7(int num) {
        if (num==0){
            return "0";
        }
//       创建一个StringBUilder
        StringBuilder result = new StringBuilder();
        int n=Math.abs(num);
        while (n!=0){
            result.append(n%7);
            n=n/7;
        }
        if (num<0){
            result.append("-");
        }
        return String.valueOf(result.reverse());

    }

}