/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/9/9 17:03
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.magicalString(6));


    }

    public int magicalString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("122");
//        现在是前两个数已经符合了，所以从第三个数开始
        int left=2;
        int right=2;
        for (int i=2;i<n;i++){
            int count=stringBuilder.charAt(right)-'0'==1?2:1;
            for (int j=0;j<stringBuilder.charAt(left)-'0';j++){
                stringBuilder.append(count);
            }
            left++;
            right=stringBuilder.length()-1;
        }

        int res=0;
        for (int i=0;i<n;i++){
            if (stringBuilder.charAt(i)-'0'==1){
                res++;
            }
        }
        return res;
    }






}
