import java.util.Arrays;

/**
 * @program: DisplayCardsInAscendingOrder
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-13 10:27
 **/


public class MyTest {


    public int[] deckRevealedIncreasing(int[] deck) {
        int[] res = new int[deck.length];
//        对数组排序
        Arrays.sort(deck);
        int index = 0;
//        填充第一个数字
        res[0]=deck[0];
//        对排序后的数组进行遍历
        for(int i=1;i<deck.length;i++){
//            寻找为0的位置
            while(res[index]!=0){
                index=(index+1)%deck.length;
            }
//           跳过这个0，找到为0的位置的下一个,因为数字都是隔一个0（空位）填充
            index=(index+1)%deck.length;
//            寻找下一个为0的位置
            while(res[index]!=0){
                index=(index+1)%deck.length;
            }
//            赋值
            res[index]=deck[i];
        }

        return res;
    }



}
