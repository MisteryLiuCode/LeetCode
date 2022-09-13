/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/8/19 18:11
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {
    public static void main(String[] args) {

    }
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res=0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime>=startTime[i] && queryTime<=endTime[i]){
                res++;
            }
        }
        return res;
    }



}
