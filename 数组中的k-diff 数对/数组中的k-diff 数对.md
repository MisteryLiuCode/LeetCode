## 题目：

给你一个整数数组 nums 和一个整数 k，请你在数组中找出 不同的 k-diff 数对，并返回不同的 k-diff 数对 的数目。

k-diff 数对定义为一个整数对 (nums[i], nums[j]) ，并满足下述全部条件：

0 <= i, j < nums.length
i != j
nums[i] - nums[j] == k
注意，|val| 表示 val 的绝对值。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/k-diff-pairs-in-an-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

示例 1：

输入：nums = [3, 1, 4, 1, 5], k = 2
输出：2
解释：数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
尽管数组中有两个 1 ，但我们只应返回不同的数对的数量。
示例 2：

输入：nums = [1, 2, 3, 4, 5], k = 1
输出：4
解释：数组中有四个 1-diff 数对, (1, 2), (2, 3), (3, 4) 和 (4, 5) 。
示例 3：

输入：nums = [1, 3, 1, 5, 4], k = 0
输出：1
解释：数组中只有一个 0-diff 数对，(1, 1) 。

## 思路：

创建map存储每一个数对应的个数，如果k=0，查看每一个数是否有两个一样的，如果有，则++

如果没有，则看map里有没有k+当前map键值。

## 代码：

```Java
public int findPairs(int[] nums, int k) {
    int sum=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    Set<Integer> set = map.keySet();
    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()){
        if (k==0){
            if (map.get(iterator.next())>1){
                sum++;
            }
        }
        else{
            if (map.containsKey(k+iterator.next())){
                sum++;
            }
        }
    }
    return sum;
```

## 结果：

![image-20220616172544786](https://misteryliu.oss-cn-beijing.aliyuncs.com/imageimage-20220616172544786.png)