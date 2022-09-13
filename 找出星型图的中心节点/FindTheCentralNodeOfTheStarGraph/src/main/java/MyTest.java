/**
 * @program: FindTheCentralNodeOfTheStarGraph
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-18 09:38
 **/


public class MyTest {

    public int findCenter(int[][] edges) {
        int result = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (edges[0][i] == edges[1][j]) {
                    result = edges[0][i];
                    break;
                }
            }
        }
        return result;
    }
}

