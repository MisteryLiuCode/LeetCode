public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.countSegments("Hello, my name is John"));
    }


    public int countSegments(String s) {
//        去除首尾字符串
        s=s.trim();
//        如果等于空字符串则返回0
        if (s.equals("")){
            return 0;
        }
//        定义flag，记录连续为空格的数量
        int  flag=0;
//        记录结果值
        int result=0;
//        遍历
        for (int i=0;i<s.length();i++){
//            如果为空格
            if (s.charAt(i)==' '){
//                空格数量++
                flag++;
            }
//            如果空格数量>0了，并且此时这个字符不为空格，则使flag置为0，使结果值++
            else if (flag>0 && s.charAt(i)!=' '){
                flag=0;
                result++;
            }
        }
//        返回结果
        return ++result;
    }



}