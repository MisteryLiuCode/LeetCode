## 题目：

给你一个整数数组 `nums` ，除某个元素仅出现 **一次** 外，其余每个元素都恰出现 **三次 。**请你找出并返回那个只出现了一次的元素。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：nums = [2,2,3,2]
输出：3
```

**示例 2：**

```
输入：nums = [0,1,0,1,0,1,99]
输出：99
```

**提示：**

- `1 <= nums.length <= 3 * 104`
- `-231 <= nums[i] <= 231 - 1`
- `nums` 中，除某个元素仅出现 **一次** 外，其余每个元素都恰出现 **三次**

## 思路：

- 对数组进行排序
- 0 0 0 1 1 1 2 3 3 3
- 0 1 1 1 2 2 2 3 3 3
- 0 0 0 1 1 1 2
- 由上面的示例可以看出来 如果一个数和左边和右边都不一样，那么可以肯定就是这个数
- 否则，要么是第一个数要么是最后一个数，再做一个判断即可

## 代码：

```java
public int singleNumber(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
//        对nums进行遍历
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        else {
            return nums[nums.length-1];
        }
    }
```

## 结果：

![image-20220302203233263](https://gitee.com/misteryliu/typora/raw/master/image/image-20220302203233263.png)