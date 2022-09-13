import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] widths = new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(Arrays.toString(myTest.numberOfLines(widths, "bbbcccdddaaa")));
    }


    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];
        int sum = 0;
        int row = 1;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            sum += widths[index - 97];
            if (sum > 100) {
                row++;
                sum = 0;
                i -= 1;
            }
        }
        res[0] = row;
        res[1] = sum;
        return res;
    }


}
