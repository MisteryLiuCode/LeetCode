import java.util.Arrays;
import java.util.HashMap;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/9/13 17:06
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {


    public static void main(String[] args) {

        MyTest myTest = new MyTest();
        int num=1992;
        System.out.println(myTest.maximumSwap(num));

    }

    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (int) s.charAt(i) - '0';
        }
        int a = 0;
        int b = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            Boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    if (max <= arr[j]) {
                        b = j;
                        max = arr[j];
                        flag = true;
                    }
                }
            }
            if (flag == true) {
                a = i;
                break;
            }
        }
        int tran = arr[a];
        arr[a] = arr[b];
        arr[b] = tran;
        StringBuilder res = new StringBuilder();
        for (int i : arr) {
            res.append(i);
        }
        return Integer.valueOf(res.toString());
    }

}
