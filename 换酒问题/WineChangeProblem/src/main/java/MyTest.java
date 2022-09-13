public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.numWaterBottles(9, 3));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int res=0;
        while (numBottles>=numExchange){
            numBottles-=numExchange;
            numBottles+=1;
            res+=numExchange;
        }
        res+=numBottles;
        return res;
    }
}
