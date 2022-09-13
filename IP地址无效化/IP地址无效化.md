## 题目：

给你一个有效的 [IPv4](https://baike.baidu.com/item/IPv4) 地址 `address`，返回这个 IP 地址的无效化版本。

所谓无效化 IP 地址，其实就是用 `"[.]"` 代替了每个 `"."`。

 

**示例 1：**

```
输入：address = "1.1.1.1"
输出："1[.]1[.]1[.]1"
```

**示例 2：**

```
输入：address = "255.100.50.0"
输出："255[.]100[.]50[.]0"
```

**提示：**

- 给出的 `address` 是一个有效的 IPv4 地址

## 思路：

- 使用java的replace方法

## 代码：

```java
public String defangIPaddr(String address) {
    return address.replace(".","[.]");
}
```

![image-20220211222945554](https://gitee.com/misteryliu/typora/raw/master/image/image-20220211222945554.png)