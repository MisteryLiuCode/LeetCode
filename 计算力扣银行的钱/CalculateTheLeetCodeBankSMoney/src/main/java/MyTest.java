/**
 * @program: CalculateTheLeetCodeBankSMoney
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-15 21:57
 **/


public class MyTest {
    public static void main(String[] args) {
        int i = totalMoney(20);
        System.out.println(i);

    }
    public static int totalMoney(int n) {
        int sum=0;
        for (int i=1;i<=n/7;i++){
            sum+=(2*i+6)*7/2;
        }
        if (n%7!=0){
            sum+=((n/7+1)*2+(n%7-1))*(n%7)/2;
        }
        return sum;
    }


}
