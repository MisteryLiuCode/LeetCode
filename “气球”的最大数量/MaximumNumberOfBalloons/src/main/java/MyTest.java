/**
 * @program: MaximumNumberOfBalloons
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-13 09:58
 **/


public class MyTest {

    public int maxNumberOfBalloons(String text) {
        int result=0;
        int aCount=0;
        int bCount=0;
        int lCount=0;
        int oCount=0;
        int nCount=0;
        for (int i=0; i<text.length();i++){
            if (text.charAt(i)=='a'){
                aCount++;
            }
            else if (text.charAt(i)=='b'){
                bCount++;
            }
            else if (text.charAt(i)=='l'){
                lCount++;
            }
            else if (text.charAt(i)=='o'){
                oCount++;
            }
            else if (text.charAt(i)=='n'){
                nCount++;
            }
        }
        int singleNum=Math.min(Math.min(aCount,bCount),nCount);
         result=Math.min(Math.min(oCount/2,lCount/2),singleNum);
         return result;
    }
}
