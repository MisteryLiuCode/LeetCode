/**
 * @program: ReverseLettersOnly
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-23 10:19
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public String reverseOnlyLetters(String s) {
//        把字符串转化为数组
        char[] strArray = s.toCharArray();
        char ext;
//        设定两个指针
        int left=0;
        int right=s.length()-1;
//        对字符串进行遍历
        while (left<=right){
//            如果left不为字母 大写65-90  小写 97-122
//            int a=s.charAt(left);
//            System.out.println(a);
            if (s.charAt(left)<65 || s.charAt(left)>122 || s.charAt(left)>90 && s.charAt(left)<97){
                left++;
            }
            else if (s.charAt(right)<65 || s.charAt(right)>122 || s.charAt(right)>90 && s.charAt(right)<97){
                right--;
            }
            else {
                ext=s.charAt(left);
                strArray[left]=strArray[right];
                strArray[right]=ext;
                left++;
                right--;
            }
        }
//        把数组转化为字符串
        s = String.valueOf(strArray);
        return s;
    }
}
