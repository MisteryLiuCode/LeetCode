import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.reverseVowels("leetcode"));
    }

    public String reverseVowels1(String s) {
        StringBuilder res=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        for (int i=left;i<s.length();i++){
            if (left>=right){
                break;
            }
            if (s.charAt(i)=='a'||s.charAt(i)=='e'
                    ||s.charAt(i)=='i'
                    ||s.charAt(i)=='o'
                    ||s.charAt(i)=='u'
                    ||s.charAt(i)=='A'
                    ||s.charAt(i)=='E'
                    ||s.charAt(i)=='I'
                    ||s.charAt(i)=='O'
                    ||s.charAt(i)=='U')
                     {
                for (int j = right; j >= 0; j--) {
                    if (left>=right){
                        break;
                    }
                    if (s.charAt(i) == 'a'
                            || s.charAt(i) == 'e'
                            || s.charAt(i) == 'i'
                            || s.charAt(i) == 'o'
                            || s.charAt(i) == 'u'
                            || s.charAt(i) == 'A'
                            || s.charAt(i) == 'E'
                            || s.charAt(i) == 'I'
                            || s.charAt(i) == 'O'
                            || s.charAt(i) == 'U') {
                        char temp = s.charAt(i);
                        res.replace(i,i+1,String.valueOf(s.charAt(j)));
                        res.replace(j,j+1,String.valueOf(temp));
                        right--;
                        break;
                    }
                    right--;
                }

            }
            left++;
            }
        return res.toString();
    }

    public String reverseVowels(String s) {
        StringBuilder stringBuilder=new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        for (int n=0;n<2;n++){
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='a'||s.charAt(i)=='e'
                        ||s.charAt(i)=='i'
                        ||s.charAt(i)=='o'
                        ||s.charAt(i)=='u'
                        ||s.charAt(i)=='A'
                        ||s.charAt(i)=='E'
                        ||s.charAt(i)=='I'
                        ||s.charAt(i)=='O'
                        ||s.charAt(i)=='U')
                {
                    if (n==0){
                        stack.push(s.charAt(i));
                    }
                    else {
                        char temp=stack.pop();
                        stringBuilder.replace(i, i + 1, String.valueOf(temp));
                    }

                }
            }
        }
        return stringBuilder.toString();
    }


}
