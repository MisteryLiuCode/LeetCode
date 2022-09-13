import java.util.ArrayList;
import java.util.List;

/**
 * @program: LetterCombinationOfTelephoneNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-26 21:18
 **/


public class MyTest {

    public static void main(String[] args) {

        MyTest myTest = new MyTest();
        System.out.println(myTest.letterCombinations("23"));
    }

//    public List<String> letterCombinations2(String digits) {
////        初始化字母和数字的对应关系
//        int[] numbers = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
//        String[] characters = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
////        保存对应的字符
//        ArrayList<String> strings = new ArrayList<>();
////        保存结果
//        StringBuilder result = new StringBuilder();
////        遍历输入
//        for (int i = 0; i < digits.length(); i++) {
//            for (int j = 0; i < numbers.length; j++) {
//                if (digits.charAt(i) - 48 == numbers[j]) {
//                    strings.add(characters[j]);
//                    break;
//                }
//            }
//        }
////        if (strings.size()==1){
////            for (int i=0;i<strings.get(0).length();i++){
////                result.add(String.valueOf(strings.get(0).charAt(i)));
////            }
////            return result;
////        }
//    }

    public List<String> letterCombinations(String digits) {
//        存储结果的list
        List<String> list = new ArrayList<>();
//        如果为null，或者如果为空直接返回结果
        if (digits == null || digits.isEmpty()) {
            return list;
        }
//        创建索引
        String[] str = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        创建数字转义后的字符
        String[] arr = new String[digits.length()];
//        对输入的遍历
        for (int i = 0; i < digits.length(); i++) {
//            获得一个字符
            char c = digits.charAt(i);
//            获取到数字对应的字符
            arr[i] = str[Integer.valueOf(Character.toString(c)) - 2];
        }

//        调用函数，输入的是index，一个StringBuilder，一个存储结果的list
        dfs(arr, 0, new StringBuilder(), list);
        return list;
    }

    /**
     * 回溯
     *
     * @param arr     存储键盘上各个键对应的字符串
     * @param index   子串将要填补的下标
     * @param currStr 当前字符串
     * @param list    结果集
     */
    public void dfs(String[] arr, int index, StringBuilder currStr, List<String> list) {
//        如果输入的对应的字符长度为0，
        if (index == arr.length) {
            list.add(currStr.toString());
            return;
        }
//        获取到数字对应的一个字符串
        String str = arr[index];
//        获取长度
        int len = str.length();
//        遍历
        for (int i = 0; i < len; i++) {
//            对每个字符加入到StringBuilder
            currStr.append(str.charAt(i));
//            再次调用，就取下一个字符的每一个
            dfs(arr, index + 1, currStr, list);
//            删除最后一个字符，比如是"234",第一次是"adg"，删除最后一个，剩下ad，接着存储adh，adi，等等。
            currStr.deleteCharAt(index);
        }
    }
}



