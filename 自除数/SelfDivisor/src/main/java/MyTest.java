import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.selfDividingNumbers(47, 85));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=left;i<=right;i++){
            Boolean flag=true;
            int clone=i;
            while (clone!=0){
                int n=clone%10;
                if (n==0 || n!=0 && i%n!=0){
                    flag=false;
                    break;
                }
                clone=clone/10;
            }
            if (flag==true){
                res.add(i);
            }
        }
        return res;
    }


}
