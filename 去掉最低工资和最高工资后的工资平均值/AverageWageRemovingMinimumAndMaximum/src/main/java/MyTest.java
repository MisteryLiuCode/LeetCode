import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] salary=new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(myTest.average(salary));
    }
    public double average(int[] salary) {
        Arrays.sort(salary);
        double res=0;
        for (int i=1;i<salary.length-1;i++){
            res+=salary[i];
        }
        res*=1.0;
        res/=salary.length-2;
        return res;
    }

}
