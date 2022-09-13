/**
 * @program: NumberOfMatchesInTheCompetition
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-06 22:16
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.numberOfMatches(14));
    }


    public int numberOfMatches(int n) {
        int result=0;
        while (n!=1){
            if (n%2==1){
                result+=(n-1)/2;
                n=(n-1)/2+1;
            }
            else {
                result+=n/2;
                n=n/2;
            }
        }
        return result;
    }


}
