import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        String[] strs=new String[]{"a","b"};
        MyTest myTest = new MyTest();
        System.out.println(myTest.minDeletionSize2(strs));
    }

    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int strLength=strs[0].length();
        int res=0;
        for (int i=0;i<strLength;i++){
            int[] arr=new int[n];
            for (int j=0;j<n;j++){
                arr[j]=strs[j].charAt(i)-'0';
            }
            Boolean flag=true;
            for (int k = 1; k < arr.length; k++) {
                if (arr[k]<arr[k-1]){
                    flag=false;
                    break;
                }
            }
            if (flag==false){
                res++;
            }
        }
        return res;
    }



    public int minDeletionSize2(String[] strs) {
        int n=strs.length;
        int strLength=strs[0].length();
        int res=0;
        for (int i=0;i<strLength;i++){
            for (int j=0;j<n-1;j++){
                if (strs[j].charAt(i)>strs[j+1].charAt(i)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
