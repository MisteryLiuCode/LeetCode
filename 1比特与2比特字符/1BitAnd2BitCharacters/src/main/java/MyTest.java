/**
 * @program: 1BitAnd2BitCharacters
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-20 10:54
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] bits=new int[]{1,1,1,0};
        System.out.println(myTest.isOneBitCharacter(bits));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int flag=1;
        for (int i=0;i<bits.length;i=i+2){
            flag=1;
            if (bits[i]==0){
                i=i-1;
                flag=0;
            }
            else {
                flag=1;
            }
        }
        Boolean result=true;
        if (flag==1){
            return false;
        }
        else {
            return true;
        }

    }
}
