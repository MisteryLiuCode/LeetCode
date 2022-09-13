/**
 * @program: GuessTheNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-05 22:10
 **/


public class MyTest {

    public int game(int[] guess, int[] answer) {
        int result=0;
        for (int i=0;i<guess.length;i++){
                if (guess[i]==answer[i]){
                    result++;
                }
        }
        return result;
    }
}
