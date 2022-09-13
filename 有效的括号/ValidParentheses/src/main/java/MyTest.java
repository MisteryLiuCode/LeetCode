import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @program: ValidParentheses
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-27 19:27
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        boolean valid = myTest.isValid("{[]}");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
//        创建栈
        Stack<String> stack = new Stack<>();
        Boolean reslut = true;
        for (int i = 0; i < s.length(); i++) {
//            判断是否是左边的括号，如果是就放入栈内
            if (String.valueOf(s.charAt(i)).equals("(") || String.valueOf(s.charAt(i)).equals("[") || String.valueOf(s.charAt(i)).equals("{") ){
                stack.push(String.valueOf(s.charAt(i)));
                continue;
            }

//            如果栈的大小大于0，就开始进行比较
            if (stack.size()>0) {
//                如果为左括号
                if (stack.peek().equals("(")) {
//                    如果匹配
                    if (String.valueOf(s.charAt(i)).equals(")")) {
//                        stack.remove(String.valueOf(s.charAt(i)));
//                        弹出栈顶元素
                        stack.pop();
                        continue;
                    } else {
//                        否则把result设置为false，并且停止循环
                        reslut = false;
                        break;
                    }
                }

                if (stack.peek().equals("[")) {
                    if (String.valueOf(s.charAt(i)).equals("]")) {
//                        stack.remove(String.valueOf(s.charAt(i)));
                        stack.pop();
                        continue;
                    } else {
                        reslut = false;
                        break;
                    }
                }
                if (stack.peek().equals("{")) {
                    if (String.valueOf(s.charAt(i)).equals("}")) {
//                        stack.remove(String.valueOf(s.charAt(i)));
                        stack.pop();
                        continue;
                    } else {
                        reslut = false;
                        break;
                    }
                }
            }
//            如果没有左边的括号，直接取右边的括号，就设置为false，并且停止循环。
            else {
                reslut=false;
                break;
            }
        }
//        如果循环到最后，栈的元素不为空，那就为false
        if (!stack.empty()) {
            reslut = false;
        }
        return reslut;
    }
}
