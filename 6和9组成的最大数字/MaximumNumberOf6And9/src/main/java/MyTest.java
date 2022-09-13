public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.maximum69Number(9996));
    }

    public int maximum69Number (int num) {
        String result="";
        Boolean falg=false;
        String stringNum=String.valueOf(num);
        for (int i=0;i<stringNum.length();i++){
            int n=stringNum.charAt(i)-'0';
            if (falg==false && n==6 ){
                falg=true;
                result+=String.valueOf(9);
            }
            else {
                result+=String.valueOf(stringNum.charAt(i));
            }
        }
        return Integer.valueOf(result);
    }


}
