import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isPerfectSquare(5));
    }
    public boolean isPerfectSquare(int num) {
        if (num==1){
            return true;
        }
        Boolean flag=true;
        int left=0;
        int right=num;
        int n=left + (right - left) / 2;
        HashSet<Integer> set = new HashSet<>();
        while (num/n !=n){
            if (num/n>n){
                left=n;
                n=left + (right - left) / 2;
            }
            else if (num/n<n){
                right=n;
                n=left + (right - left) / 2;
            }
            if (!set.add(n)){
                flag=false;
                break;
            }
        }
        if (flag==false || num%n!=0){
            return false;
        }
        else {
            return true;
        }
    }

}
