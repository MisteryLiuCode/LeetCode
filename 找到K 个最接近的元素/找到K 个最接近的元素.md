​	给定一个 排序好 的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。

整数 a 比整数 b 更接近 x 需要满足：

|a - x| < |b - x| 或者
|a - x| == |b - x| 且 a < b

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/find-k-closest-elements
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

**示例 1：**

```
输入：arr = [1,2,3,4,5], k = 4, x = 3
输出：[1,2,3,4]
```

**示例 2：**

```
输入：arr = [1,2,3,4,5], k = 4, x = -1
输出：[1,2,3,4]
```

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/find-k-closest-elements
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

提示：

- 1 <= k <= arr.length

- 1 <= arr.length <= 104
- arr 按 升序 排列
- -104 <= arr[i], x <= 104

## 思路：

双指针的方法，两个指针分别指向arr的第一个和最后一个。

计算离目标值的距离，把距离较长的指针进行移动。

如果距离相等，右边指针向做移动。

如果剩余的数等于目标数则停止移动。

## 代码：

```java
public List<Integer> findClosestElements(int[] arr, int k, int x) {
    int left=0;
    int right=arr.length-1;
    while (right-left+1>k){
        if (x-arr[left]<arr[right]-x){
            right--;
        }
        else if (x-arr[left]>arr[right]-x){
            left++;
        }
        else {
            right--;
        }
    }
    List<Integer> res = new ArrayList<>();
    for (int i=left;i<=right;i++){
        res.add(arr[i]);
    }
    return res;
}
```

## 结果：

![image-20220825181339723](https://misteryliu.oss-cn-beijing.aliyuncs.com/imageimage-20220825181339723.png)