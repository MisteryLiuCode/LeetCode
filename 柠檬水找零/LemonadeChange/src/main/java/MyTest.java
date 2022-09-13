import java.util.ArrayList;
import java.util.HashMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] bills=new int[]{5,5,5,10,20};
        System.out.println(myTest.lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills) {
        int cpin5=0;
        int coin10=0;
        for (int i=0;i<bills.length;i++) {
            if (bills[i]==5){
                cpin5++;
            }
            else if (bills[i]==10){
                if (cpin5>0){
                    cpin5--;
                    coin10++;
                }
                else {
                    return false;
                }
            }
            else{
                if (coin10>0 && cpin5>0){
                    coin10--;
                    cpin5--;
                }
                else if(cpin5>2){
                    cpin5-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }


}
