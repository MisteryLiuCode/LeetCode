public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.detectCapitalUse("FG"));
    }

    public boolean detectCapitalUse(String word) {
        Boolean result=false;
        int count=0;
        for (int i=0;i<word.length();i++){
            if(word.charAt(i)<97){
                count++;
            }
        }
        if (count==1 && word.charAt(0)<97 || count==word.length() || count==0){
            result=true;
        }
        return result;
    }

}
