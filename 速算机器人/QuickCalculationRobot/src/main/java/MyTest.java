public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.calculate("AB"));
    }

    public int calculate(String s) {
        int x=1;
        int y=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(0)=='A'){
                x=2*x+y;
            }
            else {
                y=2*y+x;
            }
        }
        return x+y;

    }



}