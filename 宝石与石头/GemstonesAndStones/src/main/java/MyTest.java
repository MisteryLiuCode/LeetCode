/**
 * @program: GemstonesAndStones
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-27 12:51
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.numJewelsInStones("aA", "aAAbbbb"));
    }
    public int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        for (int i=0;i<jewels.length();i++){
            for (int j=0;j<stones.length();j++){
                if (jewels.charAt(i)==stones.charAt(j)){
                    sum++;
                }
            }
        }
        return sum;
    }
}
