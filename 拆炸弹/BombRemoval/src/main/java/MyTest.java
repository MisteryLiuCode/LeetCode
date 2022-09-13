import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] code=new int[]{2,4,9,3};
        System.out.println(Arrays.toString(myTest.decrypt(code, -2)));
    }

    public int[] decrypt(int[] code, int k) {
        int[] result=new int[code.length];
        int sum=0;
        int n=code.length;
            if (k < 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j <= Math.abs(k); j++) {
                        int index = (i - j + n) % n;
                        sum += code[index];
                    }
                    result[i] = sum;
                    sum = 0;
                }
            }
            else if (k>0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j <= k; j++) {
                        int index = (i + j + n) % n;
                        sum += code[index];
                    }
                    result[i] = sum;
                    sum = 0;
                }
            }
            else {
                for (int i=0;i<n;i++){
                    result[i]=0;
                }
        }
        return result;
    }
}