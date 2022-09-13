public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.balancedStringSplit("RLRRLLRLRL"));

    }
    public int balancedStringSplit(String s) {
        int lNum=0;
        int rNum=0;
        Boolean flag=false;
        int res=0;
        for (int i=0;i<=s.length();i++){
            if (lNum==rNum && flag==true){
                flag=false;
                res++;
                lNum=0;
                rNum=0;
                i--;
            }
            else if (i==s.length()){
                break;
            }
            else if(s.charAt(i)=='L'){
                flag=true;
              lNum++;
            }
            else if (s.charAt(i)=='R'){
                flag=true;
                rNum++;
            }
        }
        return res;
    }
}
