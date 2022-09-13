/**
 * @program: DifferenceBetweenSumOfTheProductsOfIntegers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-26 12:01
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while (n!=0){
            sum+=n%10;
            product=product*(n%10);
            n=n/10;
        }
        sum=product-sum;
        return sum;
    }
}
