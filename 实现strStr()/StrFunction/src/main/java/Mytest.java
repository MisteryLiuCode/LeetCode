/**
 * @program: StrFunction
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-19 18:22
 **/


public class Mytest {
    public static void main(String[] args) {
        Mytest mytest = new Mytest();
        String haystack ="";
        String needle ="";
        System.out.println(mytest.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
//        遍历haystack，看是否以needle开头的。
        int result=-1;
//         先赋值，后面为了进行裁切。
        String s=haystack;

//        如果都为空，那么直接输出为0
        if (haystack.equals("")&&needle.equals("")){
            result=0;
        }
        for (int i=0;i<haystack.length();i++){
//            如果是以needle为开头的话，那么直接返回此时的i值，并且停止循环
            if (s.startsWith(needle)){
                result=i;
                break;
            }
            else {
//                否则就裁切一次。
                s=haystack.substring(i+1,haystack.length());
            }
        }
        return result;
    }

    public int strStr2(String haystack, String needle) {
//        这种方法简直狗血，直接使用indexof（)方法，这个方法的作用是，返回第一次出现子串的开始值。
//        答案也没毛病，就是不讲武德。
        return haystack.indexOf(needle);
    }

}
