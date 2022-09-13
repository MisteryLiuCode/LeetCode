/**
 * @program: FirstWrongVersion
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-29 15:54
 **/


public class MyTest {


    public int firstBadVersion(int n) {
        int newTemp=0;
        int result=0;
        if(isBadVersion(1)==true){
            return 1;
        }
        for (int i=1;i<=n;i++){
            if (isBadVersion(i)==false && isBadVersion(n) && i+1==n){
                return n;
            }
            else {
                newTemp=i+(n-i)/2;
                if (isBadVersion(newTemp)==true){
                    n=newTemp;
                }
                else {
                    i=newTemp;
                }
                i-=1;
            }
        }
        return result;
    }

    private boolean isBadVersion(int version){
        return true;
    };


}

