import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.backspaceCompare("a#c", "b"));
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();
        stacks = putChar(stacks, s);
        stackt = putChar(stackt, t);
        if (stacks.size()==stackt.size()){
            while (!stacks.isEmpty()){
                char sa=stacks.pop();
                char ta=stackt.pop();
                if (sa!=ta){
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }


    public Stack<Character> putChar(Stack<Character> stack,String s){
        for (int i=0;i<s.length();i++){
            if (String.valueOf(s.charAt(i)).equals("#")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return stack;
    }

}
