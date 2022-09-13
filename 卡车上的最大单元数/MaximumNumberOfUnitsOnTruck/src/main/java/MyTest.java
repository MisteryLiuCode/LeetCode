import java.util.Arrays;







public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
//        先按照第二个元素降序，如果第二个元素相等，就按照第一个元素降序
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] == o1[1] ? o2[0] - o1[0] : o2[1] - o1[1]);
        int res = 0;
        for (int i = 0; i < boxTypes.length && truckSize>0; i++) {
            res += Math.min(truckSize, boxTypes[i][0]) * boxTypes[i][1];
            truckSize-=boxTypes[i][0];
        }
        return res;
    }

}
