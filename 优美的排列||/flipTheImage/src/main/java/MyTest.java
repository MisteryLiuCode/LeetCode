import java.util.Arrays;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/9/8 17:55
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {
    public static void main(String[] args) {
        int[][] image=new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(MyTest.flipAndInvertImage(image)));
    }


    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] rows : image) {
            int left=0;
            int right=rows.length-1;
            while (left<right){
                if (rows[left]==rows[right]){
                    rows[left]=Math.abs(rows[left]-1);
                    rows[right]=Math.abs(rows[right]-1);
                }
                left++;
                right--;
            }
            if (image[0].length%2==1){
                rows[rows.length/2]=Math.abs(rows[rows.length/2]-1);
            }
        }
        return image;
    }




}
