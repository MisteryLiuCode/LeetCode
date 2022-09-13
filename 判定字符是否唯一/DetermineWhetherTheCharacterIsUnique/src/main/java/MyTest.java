public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isUnique("iluhwpyk"));
    }

    public boolean isUnique(String astr) {
        int[] arr=new int[52];
        int len=astr.length();
        for (int i=0;i<len;i++){
//            转化为assci码
            int n=astr.charAt(i)+0;
//            取余
            int index=n%52;
            if (arr[index]!=0){
                return false;
            }
            arr[index]=n;
        }
        return true;
    }
}
