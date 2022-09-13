## 题目：

给你一个下标从 **0** 开始的整数数组 `nums` 和两个整数 `key` 和 `k` 。**K 近邻下标** 是 `nums` 中的一个下标 `i` ，并满足至少存在一个下标 `j` 使得 `|i - j| <= k` 且 `nums[j] == key` 。

以列表形式返回按 **递增顺序** 排序的所有 K 近邻下标。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：nums = [3,4,9,1,3,9,5], key = 9, k = 1
输出：[1,2,3,4,5,6]
解释：因此，nums[2] == key 且 nums[5] == key 。
- 对下标 0 ，|0 - 2| > k 且 |0 - 5| > k ，所以不存在 j 使得 |0 - j| <= k 且 nums[j] == key 。所以 0 不是一个 K 近邻下标。
- 对下标 1 ，|1 - 2| <= k 且 nums[2] == key ，所以 1 是一个 K 近邻下标。
- 对下标 2 ，|2 - 2| <= k 且 nums[2] == key ，所以 2 是一个 K 近邻下标。
- 对下标 3 ，|3 - 2| <= k 且 nums[2] == key ，所以 3 是一个 K 近邻下标。
- 对下标 4 ，|4 - 5| <= k 且 nums[5] == key ，所以 4 是一个 K 近邻下标。
- 对下标 5 ，|5 - 5| <= k 且 nums[5] == key ，所以 5 是一个 K 近邻下标。
- 对下标 6 ，|6 - 5| <= k 且 nums[5] == key ，所以 6 是一个 K 近邻下标。
因此，按递增顺序返回 [1,2,3,4,5,6] 。 
```

**示例 2：**

```
输入：nums = [2,2,2,2,2], key = 2, k = 2
输出：[0,1,2,3,4]
解释：对 nums 的所有下标 i ，总存在某个下标 j 使得 |i - j| <= k 且 nums[j] == key ，所以每个下标都是一个 K 近邻下标。 
因此，返回 [0,1,2,3,4] 。
```

**提示：**

- `1 <= nums.length <= 1000`
- `1 <= nums[i] <= 1000`
- `key` 是数组 `nums` 中的一个整数
- `1 <= k <= nums.length`

## 思路：

- 遍历找到和key相同的元素
- 用set进行去重，要考虑下标越界

## 代码：

```java
public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /*存储结果*/
        List<Integer> result=new ArrayList<>();
        /*
        * 对数组进行遍历，找到等于key的下标
        * 长度不确定，使用Araaylist存储
        * */
        List<Integer> index=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==key){
                index.add(i);
            }
        }
//        对下标的list遍历
//        hashSet去重
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < index.size(); i++) {
            for (int j=index.get(i)-k;j<=index.get(i)+k;j++){
                if (j>=0 && j<nums.length){
                    if (set.add(j)){
                        result.add(j);
                    }

                }
            }
        }
        return result;
    }
```

## 结果：

![image-20220313135251259](https://gitee.com/misteryliu/typora/raw/master/image/image-20220313135251259.png)