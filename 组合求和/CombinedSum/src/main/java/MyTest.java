import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: CombinedSum
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-04 15:12
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] candidates=new int[]{2,3,6,7};
        System.out.println(myTest.combinationSum(candidates,7));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        创建一个存储结果的ArrayList
        List<List<Integer>> result = new ArrayList<>();
//        对数组进行排序
        Arrays.sort(candidates);
//        调用回溯
        backtrack(candidates,target,result,0,new ArrayList<Integer>());
        return result;
    }
    public void backtrack(int[] candidates,int target,List<List<Integer>> result,int i,ArrayList<Integer> tmp_list){
        if (target < 0) {
            return;
        }
        if (target == 0) {
//            等于0就符合，添加进结果
            result.add(new ArrayList<>(tmp_list));
            return;
        }
//        因为能够重复，每次遍历的时候就从i=0开始
        for (int start = i; start < candidates.length; start++) {
            if (target < 0) {
                break;
            }
//            先假设这个数据符合，添加进去
            tmp_list.add(candidates[start]);
            //System.out.println(tmp_list);
            backtrack(candidates, target - candidates[start], result, start, tmp_list);
//            说明不适合，就去掉
            tmp_list.remove(tmp_list.size() - 1);
        }

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        //System.out.println(candidates);
        backtrack(candidates, target, res, 0, new ArrayList<Integer>());
        return res;
    }

    private void backtrack2(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tmp_list) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(tmp_list));
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            if (target < 0) break;
            //System.out.println(start);
            tmp_list.add(candidates[start]);
            //System.out.println(tmp_list);
            backtrack(candidates, target - candidates[start], res, start, tmp_list);
            tmp_list.remove(tmp_list.size() - 1);
        }
    }
}
