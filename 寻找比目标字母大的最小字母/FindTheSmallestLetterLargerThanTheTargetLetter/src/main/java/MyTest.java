public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        char[] letters=new char[]{'c','f','j'};
        System.out.println(myTest.nextGreatestLetter(letters, 'a'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        Boolean flag=false;
        char res='z';
        int n=target-'0';
        for (char letter : letters) {
            int m=letter-'0';
            if (m-n>0){
                flag=true;
                res= (char) Math.min(letter,res);
            }
        }
        if (flag==false && res=='z'){
            res=letters[0];
        }
        return res;
    }


}
