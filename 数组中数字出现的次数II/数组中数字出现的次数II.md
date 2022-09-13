## 题目：

在一个数组 `nums` 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：nums = [3,4,3,3]
输出：4
```

**示例 2：**

```
输入：nums = [9,1,7,9,7,9,7]
输出：1
```

**限制：**

- `1 <= nums.length <= 10000`
- `1 <= nums[i] < 2^31`

## 思路：

- 对数组进行排序，然后三个一组进行遍历

## 代码：

```java
public int singleNumber(int[] nums) {
//        对数组进行排序
        int result=0;
        Arrays.sort(nums);
//        对nums进行循环
        for (int i=0;i<nums.length-2;i=i+3){
//            因为三个中只有一个不一样，那么不是第一个就是最后一个
            if (nums[i]!=nums[i+1] || nums[i+1]!=nums[i+2]){
                if (nums[i]!=nums[i+1]){
                   result=nums[i];
                   break;
                }
                else {
                   result=nums[i+2];
                   break;
                }
            }
        }
//        因为必然有答案，如果遍历到最后还是0，那么说明答案就是最后一个
        if (result==0){
            result=nums[nums.length-1];
        }
        return result;
    }
```

## 结果：

![image-20220207174122929](https://gitee.com/misteryliu/typora/raw/master/image/image-20220207174122929.png)